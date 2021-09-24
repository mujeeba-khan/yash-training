package com.yash.ems.service;

import com.yash.ems.model.Employee;
import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;

/*
 * Interface having declaration of all the service methods of Employee
 * it provides standardization to the application
 * 
 * @author Mujeeba
*/

public interface EmployeeService 
{
	
	/* this searchEmployeeById method is used for fetching records 
	 * of employee on the basis of eid */
	
	public Employee searchEmployeeById(int eid) throws EmployeeByIdNotFoundException;
	
	/* this searchEmployeeByName method is used for fetching records 
	 * of employee on the basis of ename */
	
	public Employee searchEmployeeByName(String ename) throws EmployeeByNameNotFoundException;

}
