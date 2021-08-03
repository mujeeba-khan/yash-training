package com.yash.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
		// keywords for exception handling are:
		// try, catch, throw, throws, finally

		int arr[] = {1,2,3,4};
		
		try { // for handling exceptions explicitly

		/*	String name = null;
			System.out.println(name.length());	//NullPointerException - default exception occured
		*/
			String name = "Yash";
			System.out.println(name.length());
			
			System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		finally {
			System.out.println(arr[2]); // executes irrespective of occuring exceptions
		}
	}

}
