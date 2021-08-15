package com.yash.carapp.exception;

/*
 *Exception class to throw the exception
 *when car type other than Maruti and Hundai is found 
 */

public class CarTypeMismatchedException extends Exception
{
	public CarTypeMismatchedException(String msg)
	{
		super(msg);
	}
}
