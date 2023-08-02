package com.example.ioc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		//CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		customerService.add();
	}

}
