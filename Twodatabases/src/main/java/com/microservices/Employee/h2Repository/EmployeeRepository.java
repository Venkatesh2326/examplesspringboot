package com.microservices.Employee.h2Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.Employee.MysqlModel.Student;
import com.microservices.Employee.h2Model.Employee;




public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
