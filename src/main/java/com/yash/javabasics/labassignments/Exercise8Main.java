package com.yash.javabasics.labassignments;

import java.util.Scanner;

public class Exercise8Main {
	

	public static void main(String args[])
	{
		Exercise8 e8 = new Exercise8();
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean flag = e8.checkNumberForPowerOfTwo(number);
		if(flag==true)
		{
			System.out.println(number + " is a power of 2");
		}
		else
		{
			System.out.println(number + " is not a power of 2");
		}
	}
	

}
