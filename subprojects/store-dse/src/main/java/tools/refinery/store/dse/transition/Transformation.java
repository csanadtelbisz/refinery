/*
 * SPDX-FileCopyrightText: 2023 The Refinery Authors <https://refinery.tools/>
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package tools.refinery.store.dse.transition;

import tools.refinery.store.dse.transition.actions.BoundAction;
import tools.refinery.store.query.OrderedResultSet;
import tools.refinery.store.query.resultset.ResultSet;
import tools.refinery.store.tuple.Tuple;

public abstract class Transformation {
	private final String name;
	private final OrderedResultSet<Boolean> activations;
	private final BoundAction action;

	public Transformation(String name, OrderedResultSet<Boolean> activations, BoundAction action) {
		this.name = name;
		this.activations = activations;
		this.action = action;
	}

	@Override
	public String toString() {
		return name;
	}

	public BoundAction getAction() {
		return action;
	}

	public ResultSet<Boolean> getAllActivationsAsResultSet() {
		return activations;
	}

	public Tuple getActivation(int index) {
		return activations.getKey(index);
	}

	public boolean fireAction(Tuple activation) {
		return action.fire(activation);
	}
}
