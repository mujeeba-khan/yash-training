package com.yash.ems.exception;

/*
 * exception for duplicate ids are not allowed
 * */
public class DuplicateIdException extends Exception 
{
	public DuplicateIdException(String msg)
	{
		super(msg);
	}
}
