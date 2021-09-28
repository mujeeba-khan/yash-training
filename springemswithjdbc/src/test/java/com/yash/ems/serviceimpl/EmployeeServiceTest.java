package com.yash.ems.serviceimpl;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;


public class EmployeeServiceTest 
{
	EmployeeServiceImpl empser = new EmployeeServiceImpl();

	@Test
	public void givenId_shouldReturn_employeeRecordWithSameId() throws EmployeeByIdNotFoundException
	{
		assertEquals((int)(empser.searchEmployeeById(5).getId()),5);
	}
	
	@Test
	public void givenName_shouldReturn_employeeRecordWithSameName() throws EmployeeByNameNotFoundException
	{
		assertEquals(empser.searchEmployeeByName("TestName").getName(),"TestName");
	}
	
}
