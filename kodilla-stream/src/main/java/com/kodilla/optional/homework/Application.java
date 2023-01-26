package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Witold Kowalski", new Teacher("Jan Koszmarek")));
        students.add(new Student("Laura Sęk", new Teacher("Tadeusz Tran")));
        students.add(new Student("Michał Osioł", new Teacher("Wanda Lipa")));
        students.add(new Student("Anna Sanak", null));

        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            System.out.println("Student: " + student.getName() + ", teacher: " + teacher.orElse(new Teacher("<undefined>")).getName());
        }
    }

    public String getStudentAndTeacher(Student student) {
        Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
        return teacher.orElse(new Teacher("<undefined>")).getName();
    }

}
