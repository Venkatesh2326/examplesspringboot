package com.pagination.demo.service;

import org.springframework.data.domain.Page;

import com.pagination.demo.model.Employees;

public interface EmployeeService {

	void save(Employees employees);

	Page<Employees> getEmployeePagination(Integer pageNumber, Integer pageSize, String sort);
}
