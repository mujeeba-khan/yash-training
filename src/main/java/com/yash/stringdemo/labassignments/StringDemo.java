package com.yash.stringdemo.labassignments;

public class StringDemo {

	public String input;

	public String getRequiredData(String input)
	{
		this.input=input;
		String ab;
		
		if(input.length()==0)
		{
			ab = "there is no string";
		}
		else
			ab = input;
		return ab;
	}
	
	
}
