package com.microservices.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.Employee.Model.Student;
import com.microservices.Employee.service.StudentService;


@RestController
@RequestMapping("/api/user")
public class DemoController {
	
	

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

	@GetMapping("/name")
	public 	String getName() {
		return "Java !";
				
	}
	
	
	@GetMapping("/address")
	public String getAddress() {
		return "hyd";
	}
	
	@GetMapping("/status")
	public String getstatus() {
		return "active";
	}
}
