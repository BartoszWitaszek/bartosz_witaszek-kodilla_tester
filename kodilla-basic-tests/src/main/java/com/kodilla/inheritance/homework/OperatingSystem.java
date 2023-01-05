package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Rozpoczęcie pracy systemu z " + year + " roku.");
    }

    public void turnOff() {
        System.out.println("System zostaje zamknięty.");
    }
}
