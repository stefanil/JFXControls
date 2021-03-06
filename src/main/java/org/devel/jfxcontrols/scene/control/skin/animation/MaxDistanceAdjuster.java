package org.devel.jfxcontrols.scene.control.skin.animation;

@FunctionalInterface
public interface MaxDistanceAdjuster {
	double adjustMaxDistance(double maxDistance, double distanceFactor);
}
