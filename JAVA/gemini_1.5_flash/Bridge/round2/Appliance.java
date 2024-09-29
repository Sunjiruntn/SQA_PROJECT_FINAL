package com.example;

// Appliance.java
public abstract class Appliance {
    protected EnergySource energySource;

    public Appliance(EnergySource energySource) {
        this.energySource = energySource;
    }

    public abstract void start();
    public abstract void stop();
}

