package com.example.spring_project.dto;

public class SmsSender implements Sender{

    @Override
    public void sendText(String user, String message){
        System.out.println("SMS : " + user + ", message : "+ message);
    }
    
}
