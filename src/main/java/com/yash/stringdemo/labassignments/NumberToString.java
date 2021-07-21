package com.yash.stringdemo.labassignments;

public class NumberToString {
	
	public double number;

	public void setNumber(double number) {
		this.number = number;
	}
	
	public String numberOutputInString()
	{
		int b = (int)number, inter, count=0;
		while(b>0)
		{
			inter = b%10;
			count++;
			b=b/10;
		}
		
		String a=number+" : "+count+" digits before decimal";
		return a;
		
	}

}
