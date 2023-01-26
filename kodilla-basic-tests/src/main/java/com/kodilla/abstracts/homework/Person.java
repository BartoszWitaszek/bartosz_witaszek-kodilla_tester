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
        Job driver = new Driver(5000);
        Job comedian = new Comedian(2500);
        Job teacher = new Teacher(3000);
        Person tomek = new Person("Tomek", 30, driver);
        Person joanna = new Person("Joanna", 25, comedian);
        Person zenon = new Person("Zenon", 45, teacher);

        Person[] person = {tomek, joanna, zenon};

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].firstName + person[i].job.getResponsibilities());
        }
    }
}
