package com.yash.ems.daoimpl;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.Transactional;
import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

public class EmployeeDaoImplTest 
{

	@Autowired
    private EmployeeDaoImpl empDaoImpl;
	
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
    public void whenSave_shouldReturn_listSizeGreaterThanZero()
    {
       empDaoImpl = new EmployeeDaoImpl(getDataSource());
       Employee emp = new Employee(0,"TestName",012,"TestDept","TestDesig","TestAddress");
       empDaoImpl.saveEmployee(emp);
       assertTrue(empDaoImpl.getEmployeeList().size()>0);
    }
	
	@Test
    @Transactional
    public void fetchingDataFromTable_shouldReturn_listIsNotEmpty()
    {
       empDaoImpl = new EmployeeDaoImpl(getDataSource());
       List<Employee> emplist = empDaoImpl.getEmployeeList();
       assertTrue(!emplist.isEmpty());
    }
	
	@Test
    @Transactional
    public void updatingDataFromTable_shouldReturn_updatedData()
    {
       empDaoImpl = new EmployeeDaoImpl(getDataSource());
       Employee emp = new Employee(0,"TestName",012,"TestDept","TestDesig","TestAddress");
       empDaoImpl.updateEmployee(emp);
       System.out.println(emp);
       assertTrue(empDaoImpl.getEmployeeList().size()>0);
    }
	
	@Test
    @Transactional
    public void deletingDataFromTable_shouldReturn_listSizeDecrementedByOne() throws EmployeeByIdNotFoundException
    {
       empDaoImpl = new EmployeeDaoImpl(getDataSource());
       int size = empDaoImpl.getEmployeeList().size();
       empDaoImpl.deleteEmployee(9);
       assertEquals(empDaoImpl.getEmployeeList().size(),size-1);
    }
	
	
	

}
