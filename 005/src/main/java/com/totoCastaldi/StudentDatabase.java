package com.totoCastaldi;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public List<Student> getAllStudents() {
        return Arrays.asList(
                new Student("Maleah" ,"Ashley", Arrays.asList("Rugby" , "Endurance Running" , "Tennis")),
                new Student("Addyson" ,"Montes", Arrays.asList("Skateboarding" , "Rowing")),
                new Student("Malaya" ,"Gray", Arrays.asList("Snowboarding" , "Soccer" , "Tennis")),
                new Student("Noel" ,"Newman", Arrays.asList("Surfing" , "Skateboarding")),
                new Student("Leandro" ,"Armstrong", Arrays.asList("Fishing" , "Rugby", "Endurance Running"))
        );
    }
}
