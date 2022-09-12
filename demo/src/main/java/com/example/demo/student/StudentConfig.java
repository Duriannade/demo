package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student deanz = new Student(
                    "Deanz",
                    "deanz@gmail.com",
                    LocalDate.of(1998, Month.OCTOBER, 25),
                    24
            );
            Student duriannade = new Student(
                    "Duriannade",
                    "duriannade@gmail.com",
                    LocalDate.of(1998, Month.OCTOBER, 25),
                    24
            );
            repository.saveAll(
                    List.of(deanz,duriannade)
            );
        };
    }
}
