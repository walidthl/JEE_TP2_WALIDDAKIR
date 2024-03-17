package org.example.hospitalapp;

import org.example.hospitalapp.entities.Patient;
import org.example.hospitalapp.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HospitalAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(HospitalAppApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository){
        return args -> {

        };
    }
}
