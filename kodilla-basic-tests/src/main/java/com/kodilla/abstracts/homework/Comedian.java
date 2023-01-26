package com.kodilla.abstracts.homework;

public class Comedian extends Job {
    public Comedian(int salary) {
        super(salary, "telling jokes.");
    }

    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        return " as comedian has responsibilities: " + responsibilities;
    }
}
