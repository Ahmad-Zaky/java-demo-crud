package com.example.demo.student;

import static java.time.Month.AUGUST;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
			Student ahmed = new Student(
				"Ahmed",
				"ahmed@gmail.com",
				LocalDate.of(1994, AUGUST, 5)
			);

            Student fouad = new Student(
				"Fouad",
				"ahmed@gmail.com",
				LocalDate.of(1996, AUGUST, 5)
			);

            repository.saveAll(
                List.of(ahmed, fouad)
            );
        };
    }
}
