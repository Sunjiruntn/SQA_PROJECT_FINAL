package com.example;

// ElectricEnergy.java
public class ElectricEnergy implements EnergySource {
    @Override
    public void turnOn() {
        System.out.println("Electric energy is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Electric energy is OFF.");
    }
}

