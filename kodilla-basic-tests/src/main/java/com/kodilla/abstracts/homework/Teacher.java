package com.kodilla.abstracts.homework;

public class Teacher extends Job {
    public Teacher() {
        super(3000, "teaching and checking homeworks.");
    }

    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        return " as teacher has responsibilities: " + responsibilities;
    }
}
