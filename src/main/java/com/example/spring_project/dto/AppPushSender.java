package com.example.spring_project.dto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component(value = "appPush")
public class AppPushSender implements Sender{
    @Override
    public void sendText(String user, String message) {
        System.out.println("AppPush : " + user + ", message : " + message);
    }
}
