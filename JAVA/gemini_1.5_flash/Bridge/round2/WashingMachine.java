package com.example;

// WashingMachine.java
public class WashingMachine extends Appliance {

    public WashingMachine(EnergySource energySource) {
        super(energySource);
    }

    @Override
    public void start() {
        System.out.println("Washing Machine is starting.");
        energySource.turnOn();
    }

    @Override
    public void stop() {
        System.out.println("Washing Machine is stopping.");
        energySource.turnOff();
    }
}
