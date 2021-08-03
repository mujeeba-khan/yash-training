package com.yash.exceptionhandling.labassignmentspart2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		try 
		{
			int size = sc.nextInt();
			int array[] = new int[size];
			System.out.println("Array size: "+array.length);
			System.out.println("Array created successfully...");
		}
		catch(NegativeArraySizeException|NumberFormatException|InputMismatchException e)
		{
			System.out.println("Array didn't get created..Enter positive integers only");
		}
		
	}

}
