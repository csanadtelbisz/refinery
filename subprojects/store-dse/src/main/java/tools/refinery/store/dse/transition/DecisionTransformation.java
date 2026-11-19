/*
 * SPDX-FileCopyrightText: 2023 The Refinery Authors <https://refinery.tools/>
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package tools.refinery.store.dse.transition;

import tools.refinery.store.model.Model;
import tools.refinery.store.query.ModelQueryAdapter;
import tools.refinery.store.query.resultset.PriorityAgenda;
import tools.refinery.store.query.resultset.PriorityResultSet;

public class DecisionTransformation extends Transformation {

	public DecisionTransformation(Model model, PriorityAgenda agenda, DecisionRule decisionRule) {
		var definition = decisionRule.rule();
		var action = definition.createAction(model);
		var precondition = definition.getPrecondition();
		var queryEngine = model.getAdapter(ModelQueryAdapter.class);
		var resultSet = queryEngine.getResultSet(precondition);
		var activations = PriorityResultSet.of(resultSet, decisionRule.priority(), agenda);
		super(decisionRule.rule().getName(), activations, action);
	}
}
