package com.yash.patternmatcherdemo.labassignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForAadharNumber {

	public static void main(String[] args)
	{
		
		int i;
		String aadhar[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list of aadhar numbers: ");
		for(i=0;i<aadhar.length;i++)
		{
			aadhar[i]=sc.next();
		}
	    System.out.println("\nValid aadhar no. are:");
		Pattern p = Pattern.compile("^[2-9]\\d{3}-\\d{4}-\\d{4}$");
		for(i=0;i<aadhar.length;i++)
		{
			Matcher m = p.matcher(aadhar[i]);
			boolean match = m.matches();
			if(match)
			{
				System.out.println(aadhar[i]);
			}
		}
		
	}	   
}
