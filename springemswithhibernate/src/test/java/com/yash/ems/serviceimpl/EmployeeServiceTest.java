package com.yash.ems.serviceimpl;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Test;
import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;


public class EmployeeServiceTest 
{
	EmployeeServiceImpl empser = new EmployeeServiceImpl();

	@Test
	@Transactional
	public void givenId_shouldReturn_employeeRecordWithSameId() throws EmployeeByIdNotFoundException
	{
		assertEquals(empser.searchEmployeeById(6).getId(),6);
	}
	
	@Test
	@Transactional
	public void givenName_shouldReturn_employeeRecordWithSameName() throws EmployeeByNameNotFoundException
	{
		assertEquals(empser.searchEmployeeByName("TestName").getName(),"TestName");
	}
	
}
