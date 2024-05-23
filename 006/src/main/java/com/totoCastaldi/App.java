package com.totoCastaldi;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(
                new StudentDatabase().getAllStudents().stream() //Stream<Student>
                        .map(Student::getActivities) //Stream<List<Activities>>
                        .flatMap(List::stream) //Stream<String>
                        .distinct() //Stream<String>
                        .sorted() //Stream<String>
                        .collect(Collectors.toList()) //List<String>
        );

    }
}
