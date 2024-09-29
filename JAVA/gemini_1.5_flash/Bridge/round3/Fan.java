package com.example;

// Fan.java
public class Fan extends Appliance {

    public Fan(EnergySource energySource) {
        super(energySource);
    }

    @Override
    public void start() {
        System.out.println("Fan is starting.");
        energySource.turnOn();
    }

    @Override
    public void stop() {
        System.out.println("Fan is stopping.");
        energySource.turnOff();
    }
}

