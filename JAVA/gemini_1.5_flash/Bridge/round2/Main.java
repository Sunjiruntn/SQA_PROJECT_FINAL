package com.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        // เรียกใช้พัดลม (Fan) กับพลังงานไฟฟ้า (ElectricEnergy)
        EnergySource electricEnergy = new ElectricEnergy();
        Appliance fan = new Fan(electricEnergy);
        
        System.out.println("=== Fan with Electric Energy ===");
        fan.start();
        fan.stop();
        
        // เรียกใช้พัดลม (Fan) กับพลังงานแบตเตอรี่ (BatteryEnergy)
        EnergySource batteryEnergy = new BatteryEnergy();
        fan = new Fan(batteryEnergy);
        
        System.out.println("=== Fan with Battery Energy ===");
        fan.start();
        fan.stop();
        
        // เรียกใช้เครื่องซักผ้า (Washing Machine) กับพลังงานไฟฟ้า (ElectricEnergy)
        Appliance washingMachine = new WashingMachine(electricEnergy);
        
        System.out.println("=== Washing Machine with Electric Energy ===");
        washingMachine.start();
        washingMachine.stop();
        
        // เรียกใช้เครื่องซักผ้า (Washing Machine) กับพลังงานแบตเตอรี่ (BatteryEnergy)
        washingMachine = new WashingMachine(batteryEnergy);
        
        System.out.println("=== Washing Machine with Battery Energy ===");
        washingMachine.start();
        washingMachine.stop();
    }
}

