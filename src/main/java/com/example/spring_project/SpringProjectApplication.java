package com.example.spring_project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring_project.config.AppConfig;
import com.example.spring_project.dto.Car;
import com.example.spring_project.dto.Hello;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringProjectApplication.class, args);
		// System.err.println("call SpringBoot!");

		// 스프링 컨텍스트를 초기화하고 설정 클래스를 로드한다.
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getName());

		Hello hello = context.getBean("hello", Hello.class);
		System.out.println(hello.sayHello());
	}
}