package com.yash.ems.serviceimpl;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.Transactional;
import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;
import com.yash.ems.model.Employee;

public class EmployeeServiceTest 
{
	@Autowired
	EmployeeServiceImpl empser;
	
	private DriverManagerDataSource ds;
	
	DriverManagerDataSource getDataSource() 
	{
		ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/empldb");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}
     

	@Test
	@Transactional
	public void givenId_shouldReturn_employeeRecordWithSameId() throws EmployeeByIdNotFoundException
	{
		empser = new EmployeeServiceImpl(getDataSource());
		assertEquals(empser.searchEmployeeById(5).getId(),5);
	}
	
	@Test
	@Transactional
	public void givenName_shouldReturn_employeeRecordWithSameName() throws EmployeeByNameNotFoundException
	{
		empser = new EmployeeServiceImpl(getDataSource());
		assertEquals(empser.searchEmployeeByName("TestName").getName(),"TestName");
	}
	
}
