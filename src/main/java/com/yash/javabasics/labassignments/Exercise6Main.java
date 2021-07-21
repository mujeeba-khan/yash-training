package com.yash.javabasics.labassignments;

import java.util.Scanner;

public class Exercise6Main {

	public static void main(String args[])
	{
		Exercise6 e6 = new Exercise6();
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int difference = e6.calculateDifference(n);
		System.out.println("Difference : "+difference);
	}
	
}
