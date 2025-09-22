package com.example.spring_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring_project.dto.Car;
import com.example.spring_project.dto.Hello;

// Java Config 클래스 구현
@Configuration
public class AppConfig {

    // Car라는 객체가 Bean이 된다. 
    // 그래서 Car클래스객체로 리턴타입을 작성해야함.
    // Map구조, Key는 car이고 value는 Car 객체
    @Bean(name = "car")
    public Car car(){
        return new Car("제네시스");
    }

    @Bean(name = "hello")
    public Hello hello(){
        return new Hello();
    }
}