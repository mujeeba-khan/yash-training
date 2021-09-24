package com.yash.ems.exception;

/*
 * exception for id if it does not exist
 */

public class EmployeeByIdNotFoundException extends Exception
{

	public EmployeeByIdNotFoundException(String msg)
	{
		super(msg);
	}
	
}
