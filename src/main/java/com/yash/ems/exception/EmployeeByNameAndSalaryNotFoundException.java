package com.yash.ems.exception;

/*
 * Exception for employee by name and salary not found 
 * 
 */

public class EmployeeByNameAndSalaryNotFoundException extends Exception
{
	public EmployeeByNameAndSalaryNotFoundException(String msg)
	{
		super(msg);
	}
	
}
