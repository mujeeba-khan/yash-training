package com.yash.patternmatcherdemo.labassignments;

import java.util.regex.Pattern;

public class PatternOnString {

	public static void main(String[] args) {


		String str = args[0];
		
		Pattern p1 = Pattern.compile("[a-z]*");
		
		String[] result1 = p1.split(str);
	      
	      for(String data1 : result1){
	         System.out.println(data1); 
	      }

	      System.out.println();
		
		Pattern p2 = Pattern.compile("[0-9]");
		
		String[] result2 = p2.split(str);
	      
	      for(String data2 : result2){
	         System.out.println(data2); 
	      }

	}

}
