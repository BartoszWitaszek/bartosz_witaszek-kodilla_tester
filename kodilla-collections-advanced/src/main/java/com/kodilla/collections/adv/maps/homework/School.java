package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<String> students = new ArrayList<>();

    public School(String schoolName, List<String> students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getSize() {
        return students.size();
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schools=" + students +
                '}';
    }
}
