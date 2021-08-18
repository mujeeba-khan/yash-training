package com.yash.emsjdbc.service;

import com.yash.emsjdbc.exception.*;

/*
 * Interface having declaration of all the service methods of Employee
 * it provides standardization to the application
*/

public interface EmployeeService 
{
	
	public void searchEmployeeById() throws EmployeeByIdNotFoundException;
	public void getEmployeesByDepartment(); 
	public void getAllDepartments();
	public void getHighestPaidEmployee();
	public void getEmployeeByNameAndSalary() throws EmployeeByNameAndSalaryNotFoundException;
	public void getLimitedRecords();
	
}
