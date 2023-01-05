package com.kodilla.abstracts.homework;

public class Driver extends Job {

    public Driver() {
        super(5000, "car driving and goods delivery.");
    }

    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        return " as driver has responsibilities: " + responsibilities;
    }
}
