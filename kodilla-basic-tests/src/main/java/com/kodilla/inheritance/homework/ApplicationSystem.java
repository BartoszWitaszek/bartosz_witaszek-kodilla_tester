package com.kodilla.inheritance.homework;

public class ApplicationSystem {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1999);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Windows98 windows98 = new Windows98(1998);
        windows98.turnOn();
        windows98.turnOff();

        Windows2000 windows2000 = new Windows2000(2000);
        windows2000.turnOn();
        windows2000.turnOff();
    }
}
