/*
 * SPDX-FileCopyrightText: 2026 The Refinery Authors <https://refinery.tools/>
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package tools.refinery.store.transition.system.statespace;

import tools.refinery.logic.dnf.Query;
import tools.refinery.logic.dnf.RelationalQuery;
import tools.refinery.logic.term.NodeVariable;
import tools.refinery.logic.term.truthvalue.TruthValue;
import tools.refinery.store.dse.transition.Transformation;
import tools.refinery.store.dse.transition.actions.Action;
import tools.refinery.store.dse.transition.actions.BoundAction;
import tools.refinery.store.model.Model;
import tools.refinery.store.query.ModelQueryAdapter;
import tools.refinery.store.query.resultset.OrderedResultSetImpl;
import tools.refinery.store.reasoning.actions.MergeActionLiteral;
import tools.refinery.store.reasoning.representation.PartialRelation;
import tools.refinery.store.tuple.Tuple;

import java.util.List;

import static tools.refinery.store.reasoning.literal.PartialLiterals.may;

public class Transition extends Transformation {
	private final BoundAction preconditionMergeTrue;

	public Transition(String name, Model model, PartialRelation precondition, Query<Boolean> mayPrecondition,
					  Action action) {
		var queryEngine = model.getAdapter(ModelQueryAdapter.class);
		var resultSet = queryEngine.getResultSet(mayPrecondition);
		var activations = new OrderedResultSetImpl<>(resultSet);
		super(name, activations, action.bindToModel(model));

		var parameters = action.getParameters();
		var preconditionMergeTrue = new Action(parameters,
				List.of(new MergeActionLiteral<>(precondition, TruthValue.TRUE, parameters)));
		this.preconditionMergeTrue = preconditionMergeTrue.bindToModel(model);
	}

	public BoundAction getPreconditionAction() {
		return preconditionMergeTrue;
	}

	public boolean mergePreconditionTrue(Tuple activation) {
		return preconditionMergeTrue.fire(activation);
	}


	public record Builder(String name, RelationalQuery precondition, Action action,
	                      PartialRelation preconditionRelation, Query<Boolean> mayPrecondition) {

			public static Builder of(TransitionRule transitionRule) {
				var preconditionRelation = transitionRule.preconditionRelation();
				var rule = transitionRule.rule();
				var precondition = rule.getPrecondition();
				NodeVariable[] parameters = new NodeVariable[precondition.arity()];
				for (int i = 0; i < precondition.arity(); ++i) {
					parameters[i] = NodeVariable.of();
				}
				var mayPrecondition = Query.of((builder) -> builder
						.parameters(parameters)
						.clause(may(preconditionRelation.call(parameters)))
				);
				var action = rule.getAction();
				return new Builder(rule.getName(), precondition, action, preconditionRelation, mayPrecondition);
			}

			public Transition build(Model model) {
				return new Transition(name, model, preconditionRelation, mayPrecondition, action);
			}
		}
}
