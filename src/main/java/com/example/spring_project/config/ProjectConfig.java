package com.example.spring_project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.spring_project") // 하위에 @Component 정의된 친구들 스캔함
public class ProjectConfig {
    
}
