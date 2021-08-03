package com.yash.patternmatcherdemo.labassignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForYashMailid {

	public static void main(String[] args) {


		String mailid = args[0];
		
		// abc.xyz@yash.com
		
		Pattern p = Pattern.compile("^[a-z]*.[a-z]*@(yash.com)$");
		Matcher m = p.matcher(mailid);
		boolean flag = m.matches();
		
		if(flag)
		{
			System.out.println(mailid+" : Valid yash mail id ");
		}
		else
			System.out.println(mailid+" : Invalid yash mail id ");

	}

}
