package com.pagination.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pagination.demo.model.Employees;
import com.pagination.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	  @Autowired
	  EmployeeRepository empRepo;
	
	  @Override
	  public Page < Employees > getEmployeePagination(Integer pageNumber, Integer pageSize, String sort) {
	    Pageable pageable = null;
	    if (sort != null) {
	      // with sorting
	      pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC, sort);
	    } else {
	      // without sorting
	      pageable = PageRequest.of(pageNumber, pageSize);
	    }
	    return empRepo.findAll(pageable);
	  }
	@Override
	public void save(Employees employees) {
		 empRepo.save(employees);
	  }
	}
