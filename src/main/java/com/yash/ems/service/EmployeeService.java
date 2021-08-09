package com.yash.ems.service;

import com.yash.ems.exception.*;

/*
 * Interface having declaration of all the service methods of Employee
 * it provides standardization to the application
*/

public interface EmployeeService 
{
	public void getEmployeeList();
	public void searchEmployeeById() throws EmployeeByIdNotFoundException;
	public void addEmployee();
	public void getEmployeesByDepartment(); 
	public void removeEmployee();
	public void updateEmployee();
	public void getAllDepartments();
	public void getHighestPaidEmployee();
	public void getEmployeeByNameAndSalary() throws EmployeeByNameAndSalaryNotFoundException;
	public void getLimitedRecords();
	
}
