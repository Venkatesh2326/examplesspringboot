package com.microservices.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.Employee.Model.Student;
import com.microservices.Employee.repository.StudentRepository;



@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepo;

    public String createStudent(Student student) {
       
    	studentrepo.save(student);
    	
    	return "student has been added";
    }

}
