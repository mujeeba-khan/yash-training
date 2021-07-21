package com.yash.javabasics.labassignments;

import java.util.Scanner;

public class Exercise5Main {

	public static void main(String args[])
	{
		Exercise5 e5 = new Exercise5();
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = e5.calculateSum(n);
		System.out.println("Sum : "+sum);
	}
	
}
