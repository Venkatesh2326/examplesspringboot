package com.validation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.validation.model.User;

import jakarta.validation.Valid;

public class EmployeeController {
	
	
	
	 @PostMapping("/employees")
	    public ResponseEntity<User> saveEmployeeData(
	        @Valid @RequestBody User user) {
	 
	        return new ResponseEntity<User>(
	            user, HttpStatus.CREATED);
	    }

}
