package com.example.spring_project.dto;

public class AppPushSender implements Sender{
    @Override
    public void sendText(String user, String message) {
        System.out.println("AppPush : " + user + ", message : " + message);
    }
}
