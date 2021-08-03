package com.yash.exceptionhandling.labassignmentspart1;

import java.util.InputMismatchException;

class Super
{
	
}

public class Question3 extends Super
{

	public static void main(String[] args) 
	{

		int arr[] = new int[3];
		String str[] = new String[3];
		
		//str[2] = 3; // type mismatch: cannot convert from int to string
		//arr[2] = "abcd"; //type mismatch: cannot convert from string to int
		
		try 
		{
			arr[1] = Integer.parseInt("one");
			
			Super s[] = new Super[3];
			s[2] = new Question3();
			
			Question3 q[] = new Question3[3];
			q[1] = (Question3)new Super(); // even if we forcefully try to convert parent 
										   // into its child type it will generate ClassCastException
		}
		catch(ClassCastException e)
		{
			System.out.println("Parent can't be converted to its child type..");
		}
		catch(NumberFormatException | InputMismatchException e)
		{
			System.out.println("Integer array can't store string values..");
		}
		
	}

}
