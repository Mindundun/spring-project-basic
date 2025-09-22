package com.example.spring_project.config;

import org.springframework.context.annotation.Bean;

import com.example.spring_project.dto.AppPushSender;
import com.example.spring_project.dto.SmsSender;
import com.example.spring_project.service.NotificationService;

// java config
public class NotificationConfig {
    
    @Bean(name = "notificationService")
    public NotificationService notificationService(){
        // return new NotificationService();

        // 생성자를 이용
        return new NotificationService(smsSender());

        // NotificationService service = new NotificationService();
        // service.setSender(smsSender());
        // return service;
    }
    
    @Bean(name = "smsSender")
    public SmsSender smsSender() {
        return new SmsSender();
    }

    // @Bean(name = "appPushSender")
    // public AppPushSender appPushSender() {
    //     return new AppPushSender();
    // }

}
