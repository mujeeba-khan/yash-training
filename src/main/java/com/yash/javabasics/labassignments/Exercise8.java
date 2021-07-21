package com.yash.javabasics.labassignments;

public class Exercise8 {
	
	public boolean checkNumberForPowerOfTwo(int n)
	{
		boolean flag = false;
		double a =  Math.log(n) / Math.log(2);
		if((int)(Math.ceil(a))==(int)Math.floor(a))
		{
			flag = true;
		}
		return flag;
	}
	
}
