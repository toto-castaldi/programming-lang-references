package com.totoCastaldi;

import java.util.function.Consumer;

public class App
{
    public static void main( String[] args )
    {
        Consumer<Student> c = Student::printActivities;
        new StudentDatabase().getAllStudents().forEach(c);
    }
}
