package com.microservices.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.Employee.Model.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
