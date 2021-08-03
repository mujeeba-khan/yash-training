package com.yash.java8;


public class FunctionalInterfaceDemo implements FunctionalInterface
{

	public static void main(String[] args) 
	{
		FunctionalInterfaceDemo fi = new FunctionalInterfaceDemo();
		fi.display();
		FunctionalInterface.showName();
		fi.show();
	}

	@Override
	public void show()
	{
		
		System.out.println("Hello people..");
		
	}

}
