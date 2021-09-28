package com.yash.emsjpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.yash.emsjpa.model.Employee;
import com.yash.emsjpa.repository.EmployeeRepository;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest 
{
	@Autowired
	EmployeeService empser;
	
	@Autowired
	EmployeeRepository emprepo;
	
	@Test
	@Transactional
	public void givenId_shouldReturn_employeeRecordWithSameId()
	{
		Employee emp = new Employee(0,"TestName",012,"TestDept","TestDesig","TestAddress");
		emprepo.save(emp);
		assertEquals(empser.getEmployeebyId(0).get().getId(),0);
	}
	
	@Test
	@Transactional
	public void givenName_shouldReturn_employeeRecordWithSameName()
	{
		Employee emp = new Employee(0,"TestName",012,"TestDept","TestDesig","TestAddress");
		emprepo.save(emp);
		assertEquals(empser.getEmployeeByName("TestName").get(0).getName(),"TestName");
	}
}
