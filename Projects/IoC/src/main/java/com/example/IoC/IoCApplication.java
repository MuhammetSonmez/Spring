package com.example.IoC;


import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IoCApplication {

	public static void main(String[] args) {

		SpringApplication.run(IoCApplication.class, args);
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
		
			CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));

			manager.add();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
