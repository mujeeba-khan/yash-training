package com.yash.exceptionhandling;

import java.io.IOException;

// If super class has declared no exception its sub class can declare unchecked exception but not checked exception 
class SuperClass {

	void msg()
	{
		System.out.println("parent");
	}
	void msg1()
	{
		System.out.println("parent1");
	} 
	void msg2() throws ArithmeticException // super class has declared an exception
	{
		System.out.println("parent2");
	} 
	
	void msg3() throws Exception // super class has declared parent Exception
	{
		System.out.println("parent3");
	} 
	
	void msg4() throws NumberFormatException // super class has declared child of Exception class
	{
		System.out.println("parent4");
	} 
	
}


public class SuperClassSubClassExceptions extends SuperClass
{
	 void msg() throws ArithmeticException // unchecked exception worked
	 {  
		 System.out.println("child");  
	 }  
	
	 /*
	 void msg1() throws IOException // checked exception : compile time error - doesnt work
	 {  
		 System.out.println("child");  
	 } */
		  
	 public static void main(String args[])
	 {  
		  SuperClass p = new SuperClassSubClassExceptions();  
		  p.msg();  
		  p.msg1();
	  }  
	
}

/*
 
// If the superclass method declares an exception, subclass overridden method
// can declare same, subclass exception or no exception but cannot declare parent exception.

public class SuperClassSubClassExceptions extends SuperClass
{
	 void msg2() throws ArithmeticException // sub class can declare same exception
	 {  
		 System.out.println("child");  
	 } 

	 void msg3() throws ArithmeticException // sub class can declare sub Exception class
	 {  
		 System.out.println("child");  
	 }
	 
	 void msg4() throws Exception // compile time error: sub class cant declare parent Exception class
		{
			System.out.println("parent3");
		} 
	 
}

*/






