package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean//araştır
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
           Student behlul = new Student(

                    "ufuk",

                    "ufuk@hotmail.com",
                    LocalDate.of(1995, AUGUST,8)

            );
            Student bihter = new Student(

                    "hazal",

                    "hazal@hotmail.com",
                    LocalDate.of(2000, APRIL,10)

            );
            repository.saveAll(
                    List.of(behlul,bihter)
            );//bu method DB'ye behlül ve bihteri kayıt eder.
        };
    }
}
