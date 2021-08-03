package com.yash.patternmatcherdemo.labassignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForEmailid {

	public static void main(String[] args) {
		
		String email = args[0];
		
		String pat = "^[a-z0-9._-]*@[a-z]*.[a-z]*$";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(email);
		boolean flag = m.matches();
		
		if(flag)
		{
			System.out.println(email+" : Valid email id ");
		}
		else
			System.out.println(email+" : Invalid email id ");
	}


	

}
