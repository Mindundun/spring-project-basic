package com.example.spring_project.dto;

import org.springframework.stereotype.Component;

// POJO 
@Component(value = "car")
public class Car {
    // field
    private String name = "제네시스";

    // Constructor method
    public Car() {
    }   

    public Car(String name) {
        this.name = name;
    }

    // Getter, Setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
