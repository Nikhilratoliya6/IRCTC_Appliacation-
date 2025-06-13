package com.CodeSnippet.myappliaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot is working!";
    }
    @GetMapping("/about")
    public String name() {
        return "Hi My name is Nikhil ratoliya ";
    }
}