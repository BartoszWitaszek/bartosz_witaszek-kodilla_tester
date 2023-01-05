package com.kodilla.abstracts.homework;

public abstract class Job {
    public int salary;
    public String responsibilities;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public abstract String getResponsibilities();
}
