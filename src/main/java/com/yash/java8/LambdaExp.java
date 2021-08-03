package com.yash.java8;

public class LambdaExp 
{

	public static void main(String[] args)
	{
		
		FunctionalInterface fi = () -> {   // lambda expression
			System.out.println("I am in lambda..");
		};
		
		fi.show();
		 
		
		FunctionalDemo d1 = (a,b) -> {	// lambda exp with 2 params
			
			System.out.println("Sum: "+(a+b));
			
		};
		
		d1.add(10, 12);
		
		
		FunctionalDemo2 d2 = (a) -> {	// lambda exp with 1 param
			
			System.out.println(a);
			
		};
		
		d2.print("Heyy guyzz..How are you ...");
		
	}

}
