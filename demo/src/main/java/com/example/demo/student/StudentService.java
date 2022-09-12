package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


public class StudentService {
    public static List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Deanz",
                        "deanz@gmail.com",
                        LocalDate.of(1998, Month.OCTOBER, 25),
                        24
                )
        );
    }
}
