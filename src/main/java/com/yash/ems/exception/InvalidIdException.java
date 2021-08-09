package com.yash.ems.exception;

/*
 * Exception for invalid id 
 * id should be greater then or equal to 100
 */

public class InvalidIdException extends Exception
{
	public InvalidIdException(String msg)
	{
		super(msg);
	}
}
