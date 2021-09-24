package com.yash.emsjpa.repository;

/*
 * EmployeeRepository inheriting the methods from JpaRepository 
 * JpaRepository methods: save(), findOne(), findById(), findAll(), count(), delete(), deleteById()...
 * 
 * @author Mujeeba
 * */

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.emsjpa.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	List<Employee> searchEmployeeByName(String ename); //custom methods
	
}
