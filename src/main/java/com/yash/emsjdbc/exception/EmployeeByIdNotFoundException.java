package com.yash.emsjdbc.exception;

/*
 * exception for id does not exist
 */

public class EmployeeByIdNotFoundException extends Exception
{

	public EmployeeByIdNotFoundException(String msg)
	{
		super(msg);
	}
	
}
