package com.example.springioc;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringiocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringiocApplication.class, args);
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);

			customerDal.add();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
