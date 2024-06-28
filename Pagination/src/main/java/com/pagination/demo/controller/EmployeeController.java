package com.pagination.demo.controller;

import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagination.demo.model.Employees;
import com.pagination.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	 @Autowired
	 private  EmployeeService employeeService;
	 
	  @GetMapping("/employees/{pageNumber}/{pageSize}")
	  public List < Employees > getEmployees(@PathVariable Integer pageNumber, @PathVariable Integer pageSize) {
	    Page < Employees> data = employeeService.getEmployeePagination(pageNumber, pageSize, null);
	    return data.getContent();
	  }
	  @GetMapping("/employees/{pageNumber}/{pageSize}/{sort}")
	  public List < Employees > getEmployees(@PathVariable Integer pageNumber, @PathVariable Integer pageSize, @PathVariable String sort) {
	    Page < Employees > data = employeeService.getEmployeePagination(pageNumber, pageSize, sort);
	    return data.getContent();
	  }
	}


