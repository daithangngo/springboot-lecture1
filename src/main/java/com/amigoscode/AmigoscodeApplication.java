package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmigoscodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeApplication.class, args);
    }

    @GetMapping
    public String helloWorld() {
        return "Hello World from Spring Boot!";
    }

}
