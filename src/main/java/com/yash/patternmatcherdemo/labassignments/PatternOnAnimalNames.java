package com.yash.patternmatcherdemo.labassignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternOnAnimalNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();	
		String p[] = str.split(" ");
		
		Pattern p1 = Pattern.compile("(cat|dog|horse)");
		String[] result1 = p1.split(str);

	      for(String data1 : result1){
	         System.out.println(data1); 
	      }



	}

}
