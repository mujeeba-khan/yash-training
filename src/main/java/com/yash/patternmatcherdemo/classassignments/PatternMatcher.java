package com.yash.patternmatcherdemo.classassignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(".a"); //two character word ending with a
		Matcher m = p.matcher("ant");
		boolean ans1 = m.matches();
		System.out.println(ans1);
		
		boolean ans2 = Pattern.compile(".s").matcher("sand").matches();
		System.out.println(ans2);
		
		boolean ans3 = Pattern.compile(".s").matcher("as").matches(); //two character word ending with s
		System.out.println(ans3);
		
		boolean ans4 = Pattern.compile("[xyz]").matcher("ababxyzabab").matches(); //should have either x or y or z only
		System.out.println(ans4);
		
		boolean ans5 = Pattern.compile("[xyz]").matcher("x").matches();
		System.out.println(ans5);
		
		boolean ans6 = Pattern.compile("[a-z]").matcher("abZS").matches(); //any lower case alphabet only
		System.out.println(ans6);
		
		boolean ans7 = Pattern.compile("[a-z]").matcher("p").matches(); 
		System.out.println(ans7);
		
		boolean ans8 = Pattern.compile("[0-9]").matcher("abZS90").matches(); //any digit from 0-9 only
		System.out.println(ans8);
		
		boolean ans9 = Pattern.compile("[0-9]").matcher("7").matches(); 
		System.out.println(ans9);
		
		boolean ans10 = Pattern.compile("[a-z A-Z 0-9]").matcher("Z").matches(); //any alpha numeric symbol
		System.out.println(ans10);
		
		boolean ans11 = Pattern.compile("a*").matcher("aaaaaa").matches(); //any no. of a's
		System.out.println(ans11);
		
		Pattern p1=Pattern.compile("\\s");  
        String[] str=p1.split("Java is a Programming language");  
        for(String str1:str)  
        {  
            System.out.println(" "+str1);  
        }     
        
        Pattern p2=Pattern.compile("\\s");  
        String[] str2=p2.split("Java is a Programming language",3); // limit=3 means after seperating 2 words it wont seperate  
        for(String str1:str2)  
        {  
            System.out.println(" "+str1);  
        }  
	}

}
