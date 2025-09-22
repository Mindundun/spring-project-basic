package com.example.spring_project.service;

import com.example.spring_project.dto.Sender;

public class NotificationService {
    // field
    private Sender sender;

    // Constructor method
    public NotificationService() {
    }
    
    public NotificationService(Sender sender) {
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
