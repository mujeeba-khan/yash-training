package com.yash.patternmatcherdemo.labassignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForLandlineNumber {

	public static void main(String[] args) {
		
		int i;
		String landline[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list of landline numbers: ");
		for(i=0;i<landline.length;i++)
		{
			landline[i]=sc.next();
		}
	    System.out.println("\nValid landline no.s with 0755 std code are:");
		Pattern p = Pattern.compile("^(0755-2)[0-9]{5}$");
		for(i=0;i<landline.length;i++)
		{
			Matcher m = p.matcher(landline[i]);
			boolean match = m.matches();
			if(match)
			{
				System.out.println(landline[i]);
			}
		}

	}

}
