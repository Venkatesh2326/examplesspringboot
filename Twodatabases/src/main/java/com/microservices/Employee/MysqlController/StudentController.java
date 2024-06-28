package com.microservices.Employee.MysqlController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.Employee.MysqlModel.Student;
import com.microservices.Employee.MysqlService.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;




@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/create")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Retrieve the badge.svg thanks to the redirect", content = @Content(mediaType = "image/svg+xml")),
			@ApiResponse(responseCode = "303", description = "Redirect to https://img.shields.io/badge/{domaine-name}-{expiration-date}-{color}", content = @Content(mediaType = "image/svg+xml")),
			@ApiResponse(responseCode = "400", description = "Bad request. Invalid extension", content = @Content(mediaType = MediaType.ALL_VALUE)),
			@ApiResponse(responseCode = "404", description = "Domaine not found", content = @Content(mediaType = MediaType.ALL_VALUE)) })
	@Operation(summary = "getall student data")
	public String getdetails(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

}
