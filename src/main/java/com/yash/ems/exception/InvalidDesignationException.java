package com.yash.ems.exception;

/*
 * 
 * Exception for entering invalid designation
 * it should follow a proper pattern eg: DSG#07
 * */

public class InvalidDesignationException extends Exception
{
	public InvalidDesignationException(String msg)
	{
		super(msg);
	}
}

