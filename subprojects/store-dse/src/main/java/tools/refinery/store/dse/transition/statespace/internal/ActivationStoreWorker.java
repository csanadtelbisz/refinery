/*
 * SPDX-FileCopyrightText: 2023 The Refinery Authors <https://refinery.tools/>
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package tools.refinery.store.dse.transition.statespace.internal;

import tools.refinery.store.dse.transition.Transformation;
import tools.refinery.store.dse.transition.statespace.ActivationStore;
import tools.refinery.store.tuple.Tuple;

import java.util.List;
import java.util.Random;

public class ActivationStoreWorker<V> {
	final ActivationStore<V> store;
	final List<? extends Transformation> transformations;

	public record ActivationResult(boolean successfulVisit, boolean mayHaveMore, int transformation, Tuple activation) {
	}

	public ActivationStoreWorker(ActivationStore<V> store, List<? extends Transformation> transformations) {
		this.store = store;
		this.transformations = transformations;
	}

	public int[] calculateEmptyActivationSize() {
		int[] result = new int[transformations.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = transformations.get(i).getAllActivationsAsResultSet().size();
		}
		return result;
	}

	public ActivationResult fireRandomActivation(V thisVersion, Random random) {
		var result = store.getRandomAndMarkAsVisited(thisVersion, random);
		if (result.successfulVisit()) {
			int selectedTransformation = result.transformation();
			Transformation transformation = transformations.get(selectedTransformation);
			int selectedActivation = result.activation();
			Tuple tuple = transformation.getActivation(selectedActivation);

			boolean success = transformation.fireAction(tuple);
			return new ActivationResult(success, result.mayHaveMore(), selectedTransformation, tuple);
		}
		return new ActivationResult(false, result.mayHaveMore(), result.transformation(), Tuple.of());
	}
}
