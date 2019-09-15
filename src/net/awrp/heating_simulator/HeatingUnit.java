package net.awrp.heating_simulator;

public class HeatingUnit {
    public HeatingUnit(double minimumEffect, double maximumEffect) {
    }

    public double getMinimumEffect() {
        return 7.0;
    }

    public double getMaximumEffect() {
        return 25.0;
    }

    public double getHeatingEffect() {
        return 7.0;
    }

    public boolean isOff() {
        return true;
    }
}
