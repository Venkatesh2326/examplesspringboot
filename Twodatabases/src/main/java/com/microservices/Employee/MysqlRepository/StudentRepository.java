package com.microservices.Employee.MysqlRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.Employee.MysqlModel.Student;




public interface StudentRepository extends JpaRepository<Student, Long> {

}
