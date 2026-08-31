/*
 * SPDX-FileCopyrightText: 2023 The Refinery Authors <https://refinery.tools/>
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package tools.refinery.store.dse.transition;

import tools.refinery.store.map.Version;

import java.util.Objects;

public final class VersionWithObjectiveValue {
	private final Version version;
	private final ObjectiveValue objectiveValue;
	private int firedTransformation = -1;
	private int firedActivation = -1;

	public VersionWithObjectiveValue(Version version, ObjectiveValue objectiveValue) {
		this.version = version;
		this.objectiveValue = objectiveValue;
	}

	public Version version() {
		return version;
	}

	public ObjectiveValue objectiveValue() {
		return objectiveValue;
	}

	public void setFiredTransformation(int transformation, int activation) {
		this.firedTransformation = transformation;
		this.firedActivation = activation;
	}

	public int getTransformation() {
		return firedTransformation;
	}

	public int getActivation() {
		return firedActivation;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || obj.getClass() != this.getClass()) return false;
		var that = (VersionWithObjectiveValue) obj;
		return Objects.equals(this.version, that.version) &&
				Objects.equals(this.objectiveValue, that.objectiveValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(version, objectiveValue);
	}

	@Override
	public String toString() {
		return "VersionWithObjectiveValue[" +
				"version=" + version + ", " +
				"objectiveValue=" + objectiveValue + ']';
	}
}
