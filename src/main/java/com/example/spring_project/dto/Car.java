package com.example.spring_project.dto;

// POJO 
public class Car {
    // field
    private String name;

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
