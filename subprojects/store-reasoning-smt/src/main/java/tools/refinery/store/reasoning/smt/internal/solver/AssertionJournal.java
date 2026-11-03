/*
 * SPDX-FileCopyrightText: 2026 The Refinery Authors <https://refinery.tools/>
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package tools.refinery.store.reasoning.smt.internal.solver;

import com.microsoft.z3.*;
import tools.refinery.logic.AbstractValue;
import tools.refinery.store.reasoning.smt.SmtSolverStrategy;

import java.util.*;

@SuppressWarnings("unchecked")
final class AssertionJournal {
	private static final int HISTORY_LIMIT = 1024;
	private final Context context;
	private final Solver solver;
	private final SmtSolverStrategy strategy;
	private final Map<Object, Assertion> desired = new LinkedHashMap<>();
	private final Set<Object> dirty = new LinkedHashSet<>();
	private final List<List<Assertion>> frames = new ArrayList<>();
	private final Map<Object, List<ScopedAssertion>> sourceFrames = new HashMap<>();
	private final Set<Assertion> encoded = new HashSet<>();
	private final Map<Assertion, Expr<BoolSort>> guards = new HashMap<>();
	private final Map<Object, Expr<BoolSort>> activeGuards = new LinkedHashMap<>();
	private boolean rebuild;

	private record Assertion(Object source, AbstractValue<?, ?> value, List<Expr<BoolSort>> expressions) {
	}

	private record ScopedAssertion(int index, Assertion assertion) {
	}

	AssertionJournal(Context context, Solver solver, SmtSolverStrategy strategy) {
		this.context = context;
		this.solver = solver;
		this.strategy = strategy;
	}

	void put(Object source, AbstractValue<?, ?> value, List<Expr<BoolSort>> expressions) {
		var assertion = new Assertion(source, value, List.copyOf(expressions));
		if (!assertion.equals(desired.put(source, assertion))) {
			dirty.add(source);
		}
	}

	void remove(Object source) {
		if (desired.remove(source) != null) {
			dirty.add(source);
		}
	}

	Status check() {
		try {
			if (rebuild) {
				reset();
			}
			var status = switch (strategy) {
				case RESET -> {
					solver.reset();
					for (var assertion : desired.values()) {
						add(assertion);
					}
					yield solver.check();
				}
				case POP_REPLAY -> {
					synchronizeFrames();
					yield solver.check();
				}
				case GUARDED_ASSUMPTIONS -> {
					synchronizeGuards();
					yield solver.check(activeGuards.values().toArray(Expr[]::new));
				}
			};
			dirty.clear();
			return status;
		} catch (RuntimeException | Error e) {
			rebuild = true;
			throw e;
		}
	}

	private void reset() {
		solver.reset();
		frames.clear();
		sourceFrames.clear();
		encoded.clear();
		guards.clear();
		activeGuards.clear();
		dirty.addAll(desired.keySet());
		rebuild = false;
	}

	private void synchronizeFrames() {
		if (frames.size() >= HISTORY_LIMIT || encoded.size() > Math.max(HISTORY_LIMIT, desired.size() * 4L)) {
			reset();
		}
		int cut = frames.size();
		for (var source : dirty) {
			var indices = sourceFrames.get(source);
			if (indices == null) {
				continue;
			}
			for (var scoped : indices) {
				if (scoped.index() >= cut) {
					break;
				}
				if (!isValid(scoped.assertion())) {
					cut = scoped.index();
					break;
				}
			}
		}
		var pending = new LinkedHashSet<>(dirty);
		if (cut < frames.size()) {
			solver.pop(frames.size() - cut);
			for (int i = frames.size() - 1; i >= cut; i--) {
				for (var assertion : frames.remove(i)) {
					encoded.remove(assertion);
					pending.add(assertion.source());
					var indices = sourceFrames.get(assertion.source());
					indices.removeLast();
					if (indices.isEmpty()) {
						sourceFrames.remove(assertion.source());
					}
				}
			}
		}
		var additions = new ArrayList<Assertion>();
		for (var source : pending) {
			var assertion = desired.get(source);
			if (assertion != null && !assertion.expressions().isEmpty() && !encoded.contains(assertion)) {
				additions.add(assertion);
			}
		}
		if (additions.isEmpty()) {
			return;
		}
		solver.push();
		int index = frames.size();
		for (var assertion : additions) {
			add(assertion);
			encoded.add(assertion);
			sourceFrames.computeIfAbsent(assertion.source(), ignored -> new ArrayList<>())
					.add(new ScopedAssertion(index, assertion));
		}
		frames.add(additions);
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private boolean isValid(Assertion assertion) {
		var current = desired.get(assertion.source());
		if (current == null) {
			return false;
		}
		if (assertion.value() == null) {
			return assertion.equals(current);
		}
		return current.value() != null && ((AbstractValue) current.value()).isRefinementOf(assertion.value());
	}

	private void synchronizeGuards() {
		if (guards.size() > Math.max(HISTORY_LIMIT, desired.size() * 4L)) {
			reset();
		}
		for (var source : dirty) {
			var assertion = desired.get(source);
			if (assertion == null || assertion.expressions().isEmpty()) {
				activeGuards.remove(source);
				continue;
			}
			var guard = guards.computeIfAbsent(assertion, key -> {
				var literal = context.mkFreshConst("smt", context.getBoolSort());
				for (var expression : key.expressions()) {
					solver.add(context.mkImplies(literal, expression));
				}
				return literal;
			});
			activeGuards.put(source, guard);
		}
	}

	private void add(Assertion assertion) {
		solver.add(assertion.expressions().toArray(Expr[]::new));
	}
}

