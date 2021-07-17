package com.yash.tdddemo.util;

public class CheckNumberForPowerOfTwo {
	
	boolean flag;
	public boolean checkNumber(String string) {

		if(string=="")
		{
			flag=false;
		}
		
		return flag;
		
	}
	public boolean checkNumber(int n) {
	
		if(n==0)
		{
			flag=false;
		}
		
		else 
		{
			
			double a =  Math.log(n) / Math.log(2);
			if((int)(Math.ceil(a))==(int)Math.floor(a))
			{
				flag = true;
			}
			
		}
		 
		return flag;
		
	}

}
