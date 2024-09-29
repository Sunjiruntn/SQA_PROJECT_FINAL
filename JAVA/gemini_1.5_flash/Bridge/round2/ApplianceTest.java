package com.example;

// ApplianceTest.java
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;


class ApplianceTest {

    @Test
    void testFanWithElectricEnergy() {
        // Arrange
        EnergySource electricEnergy = new ElectricEnergy();
        Appliance fan = new Fan(electricEnergy);

        // Act
        fan.start();
        fan.stop();

        // Assert
        assertNotNull(fan);
    }

    @Test
    void testFanWithBatteryEnergy() {
        // Arrange
        EnergySource batteryEnergy = new BatteryEnergy();
        Appliance fan = new Fan(batteryEnergy);

        // Act
        fan.start();
        fan.stop();

        // Assert
        assertNotNull(fan);
    }

    @Test
    void testWashingMachineWithElectricEnergy() {
        // Arrange
        EnergySource electricEnergy = new ElectricEnergy();
        Appliance washingMachine = new WashingMachine(electricEnergy);

        // Act
        washingMachine.start();
        washingMachine.stop();

        // Assert
        assertNotNull(washingMachine);
    }

    @Test
    void testWashingMachineWithBatteryEnergy() {
        // Arrange
        EnergySource batteryEnergy = new BatteryEnergy();
        Appliance washingMachine = new WashingMachine(batteryEnergy);

        // Act
        washingMachine.start();
        washingMachine.stop();

        // Assert
        assertNotNull(washingMachine);
    }
}
