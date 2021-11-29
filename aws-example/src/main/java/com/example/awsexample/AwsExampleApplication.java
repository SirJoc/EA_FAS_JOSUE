package com.example.awsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsExampleApplication {

    @GetMapping("/")
    public String home() {
        return "Welcome to aws it workss";
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsExampleApplication.class, args);
    }

}
