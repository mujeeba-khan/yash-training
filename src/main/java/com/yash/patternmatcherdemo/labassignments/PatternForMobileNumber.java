package com.yash.patternmatcherdemo.labassignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForMobileNumber {

	public static void main(String[] args) {
		
		String mobile = args[0];
		
	//	String pat = "[789][0-9]{9}$"; // 10 digits
	//	String pat = "0?[789]\\d{9}$"; //10 or 11 digits
		String pat = "(0|91)?[789][0-9]{9}"; // 10 or 11 or 12 digits
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(mobile);
		boolean flag = m.matches();
		
		if(flag)
		{
			System.out.println(mobile+" : Valid mobile no. ");
		}
		else
			System.out.println(mobile+" : Invalid mobile no. ");
	}

}
