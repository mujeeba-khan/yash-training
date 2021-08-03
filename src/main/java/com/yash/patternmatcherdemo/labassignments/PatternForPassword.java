package com.yash.patternmatcherdemo.labassignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForPassword {

	public static void main(String[] args) {


		String password = args[0];
		/*
			 Password rules: 
			 a) The allowed characters are a-z, A-Z 0-9, # and $
			 b) First character should be upper case Alphabet from A to S
		   	 c) The second character should be digit divisible by 2 (0, 2,4, 6, 8).
			 d) Password ends with digit 1	
		 */
		Pattern p = Pattern.compile("^[A-S][02468][a-zA-Z0-9#$]*1$");
		Matcher m = p.matcher(password);
		boolean flag = m.matches();
		
		if(flag)
		{
			System.out.println(password+" : Valid passsword ");
		}
		else
			System.out.println(password+" : Invalid password ");


	}

}
