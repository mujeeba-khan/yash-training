package com.yash.patternmatcherdemo.labassignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayWithPattern {

	public static void main(String[] args) {
		
		int i;
		String array[] = new String[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values to an array: ");
		for(i=0;i<array.length;i++)
		{
			array[i]=sc.next();
		}
	    System.out.println("\nValues starting with a or A are:");
		Pattern p = Pattern.compile("^(a|A)[a-zA-Z0-9]*$");
		for(i=0;i<array.length;i++)
		{
			Matcher m = p.matcher(array[i]);
			boolean match = m.matches();
			if(match)
			{
				System.out.println(array[i]);
			}
		}
		

	}

}
