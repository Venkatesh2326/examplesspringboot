package com.microservices.Employee.MysqlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.Employee.h2Model.Employee;
import com.microservices.Employee.h2Repository.EmployeeRepository;



@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository emprepo;
	
    public String createEmployee(Employee employee) {
       
    	emprepo.save(employee);
    	return "Student has been added";
    }
   

}
