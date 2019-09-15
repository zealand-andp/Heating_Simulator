package net.awrp.heating_simulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeatingSimulatorTDD {
    private static final double DELTA = 0.001;

    @Test
    public void testCreationOfHeatingUnitFor7kWTo25kW() {
        double minimumEffect = 7.0;
        double maximumEffect = 25.0;

        HeatingUnit unit = new HeatingUnit(minimumEffect, maximumEffect);

        // The heating unit must be initialised with the proper minimum effect
        assertEquals(minimumEffect, unit.getMinimumEffect(), DELTA);
        // The heating unit must be initialised with the proper maximum effect
        assertEquals(maximumEffect, unit.getMaximumEffect(), DELTA);
        // The heating unit must be initialised with its heating effect set at minimum
        assertEquals(minimumEffect, unit.getHeatingEffect(), DELTA);
        // The heating unit must be initialised as being off
        assertTrue(unit.isOff());
    }

    @Test
    public void testCreationOfHeatingUnitFor4kWTo15kW() {
        double minimumEffect = 4.0;
        double maximumEffect = 15.0;

        HeatingUnit unit = new HeatingUnit(minimumEffect, maximumEffect);

        // The heating unit must be initialised with the proper minimum effect
        assertEquals(minimumEffect, unit.getMinimumEffect(), DELTA);
        // The heating unit must be initialised with the proper maximum effect
        assertEquals(maximumEffect, unit.getMaximumEffect(), DELTA);
        // The heating unit must be initialised with its heating effect set at minimum
        assertEquals(minimumEffect, unit.getHeatingEffect(), DELTA);
        // The heating unit must be initialised as being off
        assertTrue(unit.isOff());
    }

    /*********************************************************\
     TEST LIST

     v Create heating unit with minimum effect 7 kW and maximum effect 25 kW
     Create heating unit with minimum effect 4 kW and maximum effect 15 kW
     Get maximum heating effect
     Get minimum heating effect
     Set heating effect per hour
     Read heating effect per hour
     Turn on heating unit
     Turn off heating unit

     Create accumulation tank
     Get volume
     Get heat dissipation surface size
     Get heating effect per hour
     Set pressure
     Get pressure
     Add internal heating unit to accumulation tank
     Get number of heating units
     Get heating unit x
     Read number of measuring points
     Read temperature of measuring point x

     Create circulation pump
     Get maximum flow rate
     Get minimum flow rate
     Set flow rate per hour
     Get flow rate per hour
     Turn on pump
     Turn off pump

     Create radiator
     Get heat dissipation surface size
     Get heating effect per hour
     Add thermostat
     Get thermostat

     Create thermostat
     Get room

     Create room
     Get room size
     Get heat loss per hour
     Get room temperature
     Add radiator
     Read number of radiators
     Get radiator x

     Create house
     Add room
     Read number of rooms
     Get room x
     Get house size
     Get heat loss per hour
     Get average temperature
     Get outside temperature

     Notes:
        Heating effect is measured in kW
        Flow rate is measured in m3/hour
        Surface and room sizes are measured in m2
        Temperature is measured in degrees Celsius
     \*********************************************************/

}