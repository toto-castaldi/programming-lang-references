package com.totoCastaldi;

import java.util.List;

public class Student {
    private final List<String> activities;
    private final String name;
    private final String surname;
    private final Double gradeLevel;

    public Student(String name, String surname, List<String> activities, Double gradeLevel) {
        this.name = name;
        this.surname = surname;
        this.activities = activities;
        this.gradeLevel = gradeLevel;
    }

    public void printActivities() {
        System.out.println(this.activities);
    }

    public String getName() {
        return this.name;
    }

    public Double getGradeLevel() {
        return this.gradeLevel;
    }

    public List<String> getActivities() {
        return this.activities;
    }
}
