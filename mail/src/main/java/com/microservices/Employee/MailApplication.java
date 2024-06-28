package com.microservices.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.microservices.Employee.service.MailService;

@SpringBootApplication
public class MailApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MailApplication.class, args);
		
		MailService bean = ctx.getBean(MailService.class);
		//bean.sendSimpleMessage();
		bean.sendEmailWithAttachment();
		
	}

	
}
