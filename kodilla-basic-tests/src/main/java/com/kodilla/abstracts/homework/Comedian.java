package com.kodilla.abstracts.homework;

public class Comedian extends Job {
    public Comedian() {
        super(2500, "telling jokes.");
    }

    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        return " as comedian has responsibilities: " + responsibilities;
    }
}
