package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Job driver = new Driver();
        Job comedian = new Comedian();
        Job teacher = new Teacher();
        Person tomek = new Person("Tomek", 30, driver);
        Person joanna = new Person("Joanna", 25, comedian);
        Person zenon = new Person("Zenon", 45, teacher);

        Person[] person = {tomek, joanna, zenon};

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].firstName + person[i].job.getResponsibilities());
        }
    }
}
