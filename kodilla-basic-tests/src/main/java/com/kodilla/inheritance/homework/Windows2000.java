package com.kodilla.inheritance.homework;

public class Windows2000 extends OperatingSystem {

    public Windows2000(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Witamy w systemie Windows 2000.");
    }
}
