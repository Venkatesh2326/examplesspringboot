package com.microservices.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {
	
	
	@Autowired
	private JavaMailSender emailSender;
	
	 public void sendSimpleMessage() {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo("srikarkurma5@gmail.com");
	        message.setSubject("kakinda");
	        message.setText("hello");
	        emailSender.send(message);
	        System.out.println("mail successful");
	    }
	 
	 
	 public void sendEmailWithAttachment() {
			try {
				MimeMessage msg = emailSender.createMimeMessage();
				// true = multipart message
				MimeMessageHelper helper = new MimeMessageHelper(msg, true);
				helper.setTo("srikarkurma9@gmail.com");
				//helper.setTo("vinaykumar.vvk1998@gmail.com");
				helper.setSubject("Testing from Spring Boot--");
				
				helper.setText("Check attachment for image!", true);
				helper.addAttachment("resume.pdf",
						new FileSystemResource("C:\\Users\\Public\\Documents\\venkatesh resume.pdf"));
				emailSender.send(msg);
				 System.out.println("mail successful dd");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}








}
