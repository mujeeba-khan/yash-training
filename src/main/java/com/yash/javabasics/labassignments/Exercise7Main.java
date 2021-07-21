package com.yash.javabasics.labassignments;

import java.util.Scanner;

public class Exercise7Main {

	public static void main(String args[])
	{
		Exercise7 e7 = new Exercise7();
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean flag = e7.checkNumber(number);
		if(flag==true)
		{
			System.out.println(number + " is an increasing number");
		}
		else
		{
			System.out.println(number + " is not an increasing number");
		}
	}
	
}
