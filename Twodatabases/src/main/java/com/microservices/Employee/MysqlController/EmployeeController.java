package com.microservices.Employee.MysqlController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.Employee.MysqlService.EmployeeService;
import com.microservices.Employee.h2Model.Employee;

@RestController
@RequestMapping("/api/teachers")
public class EmployeeController {
	
	  @Autowired
	    private EmployeeService employeeService;
	  
	  @PostMapping("/create")
	    public String getdetails(@RequestBody Employee employee) {
			return employeeService.createEmployee(employee);
		}

	    }
	    


