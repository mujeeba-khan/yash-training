package com.yash.abstraction;

public abstract class Employee implements AtmMachine
{

	Employee()
	{
		System.out.println("Constructor");
	}
	
	void getCompanyName() // concrete methods
	{
		System.out.println("Yash tech");
	}
	
	//final static String city = "Indore"; 
	static String city = "Indore"; 
	
	abstract void getId(); //abstract methods
	abstract void getSal();
	abstract void getDesg();
	
	static void getPincode()
	{
		System.out.println("452019");
	}
	
}
