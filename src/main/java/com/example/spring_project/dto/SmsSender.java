package com.example.spring_project.dto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component(value = "sms")
public class SmsSender implements Sender{

    @Override
    public void sendText(String user, String message){
        System.out.println("SMS : " + user + ", message : "+ message);
    }
    
}
