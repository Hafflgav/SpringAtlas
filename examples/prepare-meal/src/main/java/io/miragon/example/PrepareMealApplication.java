package io.miragon.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PrepareMealApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(PrepareMealApplication.class, args);
    }
}