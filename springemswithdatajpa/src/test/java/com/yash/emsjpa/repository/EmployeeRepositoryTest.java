package com.yash.emsjpa.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yash.emsjpa.model.Employee;

class EmployeeRepositoryTest {

	@Autowired
	EmployeeRepository employeeRepository;
	
	 @Test
	    public void whenFindingDataFromRepository_thenFindingDataShouldBeSuccessful() 
	 {
		   List<Employee> employees = new ArrayList<Employee>();
		   employeeRepository.findAll().forEach(employees::add);
	       assertThat(employees.size()).isEqualTo(1);
	 }
}
