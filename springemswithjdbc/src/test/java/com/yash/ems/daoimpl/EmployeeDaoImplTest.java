package com.yash.ems.daoimpl;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import com.yash.ems.model.Employee;

public class EmployeeDaoImplTest 
{

    EmployeeDaoImpl empDaoImpl = new EmployeeDaoImpl();
     
	@Test
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
    public void updatingDataFromTable_shouldReturn_updatedData()
    {
       Employee emp = new Employee(0,"TestName",012,"TestDept","TestDesig","TestAddress");
       empDaoImpl.updateEmployee(emp);
       System.out.println(emp);
       assertTrue(empDaoImpl.getEmployeeList().size()>0);
    }
	
	@Test
    public void deletingDataFromTable_shouldReturn_listSizeDecrementedByOne()
    {
       int size = empDaoImpl.getEmployeeList().size();
       empDaoImpl.deleteEmployee(11);
       assertEquals(empDaoImpl.getEmployeeList().size(),size-1);
    }
	
	
	

}
