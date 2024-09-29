package com.example;

// BatteryEnergy.java
public class BatteryEnergy implements EnergySource {
    @Override
    public void turnOn() {
        System.out.println("Battery energy is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Battery energy is OFF.");
    }
}

