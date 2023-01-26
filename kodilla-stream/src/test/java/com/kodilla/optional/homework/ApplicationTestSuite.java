package com.kodilla.optional.homework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {
    private List<Student> students;
    private Application application;

    @BeforeEach
    public void setUp() {
        application = new Application();
        students = new ArrayList<>();
        students.add(new Student("Witold Kowalski", new Teacher("Jan Koszmarek")));
        students.add(new Student("Laura Sęk", new Teacher("Tadeusz Tran")));
        students.add(new Student("Michał Osioł", new Teacher("Wanda Lipa")));
        students.add(new Student("Anna Sanak", null));
    }

    @Test
    public void testIfGetStudentAndTeacherReturnsCorrectValue() {
        String teacher;

        teacher = application.getStudentAndTeacher(students.get(1));

        assertEquals("Tadeusz Tran", teacher);
    }

    @Test
    public void testIfGetStudentAndTeacherReturnsUndefined() {
        String teacher;

        teacher = application.getStudentAndTeacher(students.get(3));

        assertEquals("<undefined>", teacher);
    }
}