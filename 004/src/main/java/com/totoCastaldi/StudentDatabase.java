package com.totoCastaldi;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public List<Student> getAllStudents() {
        return Arrays.asList(
                new Student("Maleah" ,"Ashley", Arrays.asList("Rugby" , "Endurance Running" , "Tennis"), 1.5),
                new Student("Addyson" ,"Montes", Arrays.asList("Skateboarding" , "Rowing"), 2.3),
                new Student("Malaya" ,"Gray", Arrays.asList("Snowboarding" , "Soccer" , "Tennis"), 3.0),
                new Student("Noel" ,"Newman", Arrays.asList("Surfing" , "Skateboarding"), 1.0),
                new Student("Leandro" ,"Armstrong", Arrays.asList("Fishing" , "Rugby", "Endurance Running"), 4.3)
        );
    }
}
