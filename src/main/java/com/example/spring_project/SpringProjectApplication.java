package com.example.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.spring_project.config.AppConfig;
import com.example.spring_project.config.NotificationConfig;
import com.example.spring_project.config.ProjectConfig;
import com.example.spring_project.dto.Car;
import com.example.spring_project.dto.Hello;
import com.example.spring_project.dto.Vehicle;
import com.example.spring_project.service.NotificationService;

// @ComponentScan(basePackages = "com.example.spring_project")
// @Configuration
@SpringBootApplication
public class SpringProjectApplication {

	@Bean(name = "vehicle")
	public Vehicle vehicle() {
		return new Vehicle("자전거@");
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(NotificationConfig.class);

		NotificationService notificationService = context.getBean("notificationService", NotificationService.class);
		System.out.println(notificationService.getSender());	// com.example.spring_project.dto.SmsSender@70e8f8e출력
		notificationService.sendNotification("Mindundun", "you can do it!!!"); // SMS : Mindundun, message : you can do it!!!
	}
	// public static void main(String[] args) {
	// 	ConfigurableApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);

	// 	Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
	// 	System.out.println(vehicle.getName());
	// 	vehicle.setName("자전거!!");
	// 	System.out.println(vehicle.getName());

	// 	Car car = context.getBean("car", Car.class);
	// 	System.out.println(car.getName());

	// 	Hello hello = context.getBean("hello", Hello.class);
	// 	System.out.println(hello.sayHello());

	// }
	// 1. 자바 설정(Java Config)  클래스에서 @Bean 애노테이션을 사용하여 빈을 정의하는 방법
	// public static void main(String[] args) {
	// 	// 스프링 컨텍스트를 초기화하고 설정 클래스를 로드한다.
	// 	AnnotationConfigApplicationContext context = 
	// 		new AnnotationConfigApplicationContext(AppConfig.class);
		
	// 	Car car = context.getBean("car", Car.class);
	// 	System.out.println(car.getName());

	// 	Hello hello = context.getBean("hello", Hello.class);
	// 	System.out.println(hello.sayHello());
	// }
	// public static void main(String[] args) {
		
	// 	// 2. 스테레오 타입 애노테이션을 사용하여 빈 정의
	// 	// 스프링 컨텍스트를 초기화하고 설정 클래스를 로드한다.
	// 	AnnotationConfigApplicationContext context = 
	// 		new AnnotationConfigApplicationContext(ProjectConfig.class);
		
	// 	Car car = context.getBean("car", Car.class);
	// 	System.out.println(car.getName()); // 제네시스 출력

	// 	car.setName("그랜저");
	// 	System.out.println(car.getName()); // 그랜저 출력
		

	// 	Hello hello = context.getBean("hello", Hello.class);
	// 	System.out.println(hello.sayHello());
	// }


}