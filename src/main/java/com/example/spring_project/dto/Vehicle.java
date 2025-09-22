package com.example.spring_project.dto;

public class Vehicle {
    // field
    private String name;
    
    // Constructor method
    public Vehicle() {
    }    

    public Vehicle(String name) {
        this.name = name;
    }

    // getter, setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
    
}
