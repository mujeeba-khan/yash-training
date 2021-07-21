package com.yash.stringdemo.labassignments;

public class NumberToStringMain {

	public static void main(String[] args) {
		
		NumberToString num = new NumberToString();
		num.setNumber(Double.parseDouble(args[0]));
		String a = num.numberOutputInString();
		System.out.println(a);
		
	}

}
