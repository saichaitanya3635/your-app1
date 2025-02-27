package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class App {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Microservice!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}