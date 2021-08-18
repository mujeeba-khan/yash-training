package com.yash.emsjdbc.dao;

/*
 * Interface having declaration of all the dao methods of Employee
 * it provides standardization to the application
*/

public interface EmployeeDao 
{
	public void getEmployeeList();
	public void addEmployee();
	public void removeEmployee();
	public void updateEmployee();
}
