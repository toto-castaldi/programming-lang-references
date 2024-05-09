package com.totoCastaldi;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Student> students = Arrays.asList(new Student("Antonio", 48), new Student("Viola", 21), new Student("Federico", 19));
        students.forEach((a) -> System.out.println(a.toString().toUpperCase()));
    }
}
