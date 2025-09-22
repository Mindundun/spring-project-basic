package com.example.spring_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController { // POJO 객체 : extends X

    @RequestMapping("/hello")
    public String hello() {
        return "<h1>Hi, SpringBoot FrameWork!!</h1>";
    }
}
