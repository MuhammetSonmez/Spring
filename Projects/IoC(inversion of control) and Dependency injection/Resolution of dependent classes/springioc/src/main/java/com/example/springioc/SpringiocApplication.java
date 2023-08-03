package com.example.springioc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringiocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringiocApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		ICustomerService customerService = context.getBean("service",ICustomerService.class);

		customerService.add();

	}

}
