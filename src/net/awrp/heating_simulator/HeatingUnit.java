package net.awrp.heating_simulator;

public class HeatingUnit {
    private final double minimumEffect;
    private final double maximumEffect;

    public HeatingUnit(double minimumEffect, double maximumEffect) {
        this.minimumEffect = minimumEffect;
        this.maximumEffect = maximumEffect;
    }

    public double getMinimumEffect() {
        return minimumEffect;
    }

    public double getMaximumEffect() {
        return maximumEffect;
    }

    public double getHeatingEffect() {
        return getMinimumEffect();
    }

    public boolean isOff() {
        return true;
    }
}
