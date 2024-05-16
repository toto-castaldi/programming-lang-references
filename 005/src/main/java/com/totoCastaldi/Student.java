package com.totoCastaldi;

import java.util.List;

public class Student {
    private final List<String> activities;
    private final String name;
    private final String surname;

    public Student(String name, String surname, List<String> activities) {
        this.name = name;
        this.surname = surname;
        this.activities = activities;
    }

    public void printActivities() {
        System.out.println(this.activities);
    }
}
