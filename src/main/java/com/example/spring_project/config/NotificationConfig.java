package com.example.spring_project.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.spring_project.dto.AppPushSender;
import com.example.spring_project.dto.Sender;
import com.example.spring_project.dto.SmsSender;
import com.example.spring_project.service.NotificationService;

// java config
// @Configuration
public class NotificationConfig {
    
    @Bean(name = "notificationService")    
    public NotificationService notificationService(@Qualifier(value = "smsSender") Sender sender){
        // return new NotificationService();

        // 생성자를 이용하여 의존성 주입
        // return new NotificationService(smsSender());

        // Setter를 이용하여 의존성 주입
        // NotificationService service = new NotificationService();
        // service.setSender(smsSender());
        // return service;

        // 매개변수의 Sender sender를 받아
        // Sender 인터페이스로 구현된 클래스 확인 후 현재는 smsService밖에 없어서 해당 클래스로 매개변수를 받아 처리
        // 만약 Sender 인터페이스로 구현된 클래스의 빈이 2개 이상이면 오류 발생
        // -> 이를 해결하기 위한 @Primary, @Qualifier가 있다.
        NotificationService service = new NotificationService();
        service.setSender(sender);
        return service;
    }
    // @Primary
    @Bean(name = "smsSender")
    public SmsSender smsSender() {
        return new SmsSender();
    }

    @Bean(name = "appPushSender")
    public AppPushSender appPushSender() {
        return new AppPushSender();
    }

}
