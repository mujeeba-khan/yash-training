package com.yash.javabasics.classassignments;

public class ConstantImplementation {

	public static void main(String[] args) {

		double salary = Double.parseDouble(args[0]);
		double it = Constants.incometax * salary;
		System.out.println("Final Income tax: " + it);
		
		double price = Double.parseDouble(args[1]);
		double st = Constants.salestax * price;
		System.out.println("Final Sales tax: " + st);


	}

}
