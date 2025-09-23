package com.example.spring_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.spring_project.dto.Sender;

@Service(value = "notification")
public class NotificationService {
    // field
    private Sender sender;

    // Constructor method
    public NotificationService() {
    }
    
    @Autowired
    public NotificationService(@Qualifier(value ="sms") Sender sender) {
        this.sender = sender;
    }

    // getter, setter method
    public Sender getSender() {
        return sender;
    }  

    public void setSender(Sender sender) {
        this.sender = sender;
    }


    public void sendNotification(String user, String message){
        sender.sendText(user, message);
    }      

}
