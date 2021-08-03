package com.yash.oopsconceptdemo;

public final class FinalKeyword {

	int radius = 23;
	final double pi = 3.14;
	
	final void areaOfCircle()
	{
		double area = pi*radius*radius;
		System.out.println("Area: "+area);
		
		//	pi = 45.6; // final: pi values cant be changed
	}
	
	
	
}
