package com.pagination.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pagination.demo.service.EmployeeService;
import com.pagination.demo.model.Employees;
@SpringBootApplication
public class PaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}


	@Bean
	  public CommandLineRunner demo(EmployeeService employeeService) {
	    return (args) -> {
	      // save few employee
	      Employees emp1 = new Employees();
	      emp1.setName("Adam");
	      emp1.setDesign("Developer");
	      Employees emp2 = new Employees();
	      emp2.setName("Robert");
	      emp2.setDesign("Tester");
	      Employees emp3 = new Employees();
	      emp3.setName("John");
	      emp3.setDesign("Designer");
	      Employees emp4 = new Employees();
	      emp4.setName("William");
	      emp4.setDesign("Server Admin");
	      Employees emp5 = new Employees();
	      emp5.setName("Robin");
	      emp5.setDesign("Team Lead");
	      Employees emp6 = new Employees();
	      emp6.setName("Peter");
	      emp6.setDesign("Developer");
	      Employees emp7 = new Employees();
	      emp7.setName("Jack");
	      emp7.setDesign("Tester");
	      Employees emp8 = new Employees();
	      emp8.setName("Sam");
	      emp8.setDesign("SEO Executive");
	      Employees emp9 = new Employees();
	      emp9.setName("Ronnie");
	      emp9.setDesign("Developer");
	      Employees emp10 = new Employees();
	      emp10.setName("Ricky");
	      emp10.setDesign("Project Lead");
	      employeeService.save(emp1);
	      employeeService.save(emp2);
	      employeeService.save(emp3);
	      employeeService.save(emp4);
	      employeeService.save(emp5);
	      employeeService.save(emp6);
	      employeeService.save(emp7);
	      employeeService.save(emp8);
	      employeeService.save(emp9);
	      employeeService.save(emp10);
	    };
	  }
	}


