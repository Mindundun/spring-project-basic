package com.example.spring_project.dto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value = "hello")
public class Hello {

    public Hello() {

    }

    public String sayHello() {
        return "Hello!";
    }
}
