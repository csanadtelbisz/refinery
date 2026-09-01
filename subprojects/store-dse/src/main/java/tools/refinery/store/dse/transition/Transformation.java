/*
 * SPDX-FileCopyrightText: 2023 The Refinery Authors <https://refinery.tools/>
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package tools.refinery.store.dse.transition;

import tools.refinery.store.dse.transition.actions.BoundAction;
import tools.refinery.store.model.Model;
import tools.refinery.store.query.ModelQueryAdapter;
import tools.refinery.store.query.OrderedResultSet;
import tools.refinery.store.query.resultset.PriorityAgenda;
import tools.refinery.store.query.resultset.PriorityResultSet;
import tools.refinery.store.query.resultset.ResultSet;
import tools.refinery.store.tuple.Tuple;

import java.util.Optional;

public class Transformation {
	private final DecisionRule decisionRule;
	private final OrderedResultSet<Boolean> activations;
	private final BoundAction action;
	private final Optional<BoundAction> oppositeAction;

	public Transformation(Model model, PriorityAgenda agenda, DecisionRule decisionRule) {
		this.decisionRule = decisionRule;
		var definition = decisionRule.rule();
		var precondition = definition.getPrecondition();
		var queryEngine = model.getAdapter(ModelQueryAdapter.class);
		action = definition.createAction(model);
		var resultSet = queryEngine.getResultSet(precondition);
		activations = PriorityResultSet.of(resultSet, decisionRule.priority(), agenda);
		oppositeAction = decisionRule.rule().getOppositeAction(model);
	}

	public DecisionRule getDefinition() {
		return decisionRule;
	}

	public ResultSet<Boolean> getAllActivationsAsResultSet() {
		return activations;
	}

	public Tuple getActivation(int index) {
		return activations.getKey(index);
	}

	public boolean fireActivation(Tuple activation) {
		return action.fire(activation);
	}

	public boolean hasOppositeAction() {
		return oppositeAction.isPresent();
	}

	public boolean fireOppositeActivation(Tuple activation) {
		return oppositeAction
				.orElseThrow(() -> new IllegalStateException("No opposite action available"))
				.fire(activation);
	}
}
