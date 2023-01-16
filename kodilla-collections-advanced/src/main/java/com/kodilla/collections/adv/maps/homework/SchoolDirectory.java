package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();
        Principal john = new Principal("John Smith");
        Principal jerry = new Principal("Jerry Strongarm");
        Principal libby = new Principal("Libby Tracey");

        School johnSchool = new School("First School", Arrays.asList("John", "Terry", "Sammy", "Betty"));
        School jerrySchool = new School("Second School", Arrays.asList("John", "Terry", "Sammy"));
        School libbySchool = new School("Third School", Arrays.asList("John", "Terry", "Sammy", "Betty", "Rolf"));

        schoolDirectory.put(john, johnSchool);
        schoolDirectory.put(jerry, jerrySchool);
        schoolDirectory.put(libby, libbySchool);

        for (Map.Entry<Principal, School> schoolEntry : schoolDirectory.entrySet()) {
            System.out.println("Principal: " + schoolEntry.getKey().getPrincipalName() + ", school: " + schoolEntry.getValue().getSchoolName() + ", number od students: " + schoolEntry.getValue().getSize());
        }
    }
}
