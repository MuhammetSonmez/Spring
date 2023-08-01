package com.example.ioc_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocConfigApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		manager.add();
	}

}
