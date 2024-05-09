package com.totoCastaldi;

import java.util.Objects;

public class Student {

    private final String name;
    private final int age;

    public Student(String name, int age) {
        Objects.requireNonNull(name);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " with age " + age;
    }
}
