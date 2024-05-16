package com.totoCastaldi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        Map<String, List<String>> collected = new StudentDatabase().getAllStudents().stream()
                .filter(student -> student.getGradeLevel() > 2)
                .collect(Collectors.toMap(student -> student.getName(), student -> student.getActivities()));

        System.out.println(collected);
    }
}
