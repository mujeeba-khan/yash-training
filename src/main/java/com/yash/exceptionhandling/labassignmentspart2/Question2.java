package com.yash.exceptionhandling.labassignmentspart2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		System.out.println("Enter input: ");
		Scanner sc = new Scanner(System.in);
		double d;
		try {
			String s = sc.next();
			d = Double.parseDouble(s);
			System.out.println("All good");
		}catch(NumberFormatException e)
		{
			d = 0;
			System.out.println("Wrong input type..");
		}
		

	}

}