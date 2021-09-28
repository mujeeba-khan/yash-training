package com.yash.emsjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.emsjpa.model.Employee;
import com.yash.emsjpa.repository.EmployeeRepository;

@Service
public class EmployeeService
{
	 @Autowired
	 EmployeeRepository employeeRepository;
	 
	 public Optional<Employee> getEmployeebyId(int id)
	 {
		 return employeeRepository.findById(id);
	 }
	 
	 public List<Employee> getEmployeeByName(String name)
	 {
		 return employeeRepository.searchEmployeeByName(name);
	 }
}
