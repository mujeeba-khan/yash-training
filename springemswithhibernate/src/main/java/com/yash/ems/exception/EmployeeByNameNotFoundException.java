package com.yash.ems.exception;

/*
 * Exception for employee if name is not found 
 * 
 */

public class EmployeeByNameNotFoundException extends Exception
{
	public EmployeeByNameNotFoundException(String msg)
	{
		super(msg);
	}
	
}
