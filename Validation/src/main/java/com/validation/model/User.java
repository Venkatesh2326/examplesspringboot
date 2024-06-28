package com.validation.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
	
    @NotNull(message = "Enter a valid Employee Id")
    private Long Emp_id;
 
    @NotEmpty(message = "Must not be Empty and NULL")
    private String phoneNumber;
 
    @NotBlank(message = "Employee name can't be left empty")
    private String EmployeeName;
 
    @Min(value = 18, message = "Minimum working age 18")
    @Max(value = 60, message = "Maximum working age 60")
    private Integer age;
 
    @Email(message = "Please enter a valid email Id")
    @NotNull(message = "Email cannot be NULL")
    private String EmailId;

 
    @Size(
        min = 10, max = 100,
        message = "Address should have a length between 10 and 100 characters.")
    private String employeeAddress;
    
    @Past
    private Date birthday;
    
}


