package com.yash.ems.daoimpl;

import static org.junit.Assert.*;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import com.yash.ems.model.Employee;

public class EmployeeDaoImplTest 
{

    EmployeeDaoImpl empDaoImpl = new EmployeeDaoImpl();
	
     
	@Test
    @Transactional
    public void whenSave_shouldReturn_listSizeGreaterThanZero()
    {
       Employee emp = new Employee(0,"TestName",012,"TestDept","TestDesig","TestAddress");
       empDaoImpl.saveEmployee(emp);
       assertTrue(empDaoImpl.getEmployeeList().size()>0);
    }
	
	@Test
    public void fetchingDataFromTable_shouldReturn_listIsNotEmpty()
    {
       List<Employee> emplist = empDaoImpl.getEmployeeList();
       assertTrue(!emplist.isEmpty());
    }
	
	@Test
    @Transactional
    public void updatingDataFromTable_shouldReturn_updatedData()
    {
       Employee emp = new Employee(0,"TestName",012,"TestDept","TestDesig","TestAddress");
       empDaoImpl.updateEmployee(emp);
       System.out.println(emp);
       assertTrue(empDaoImpl.getEmployeeList().size()>0);
    }
	
	@Test
    @Transactional
    public void deletingDataFromTable_shouldReturn_listSizeDecrementedByOne()
    {
       int size = empDaoImpl.getEmployeeList().size();
       Employee emp = new Employee();
       emp.setId(5);
       empDaoImpl.deleteEmployee(emp);
       assertEquals(empDaoImpl.getEmployeeList().size(),size-1);
    }
	
	
	

}
