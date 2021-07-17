package com.yash.tdddemo.util;

public class IncreasingNumber {
	
	boolean flag;
	public boolean checkNumber(String string) {

		if(string=="")
		{
			flag=false;
		}
		
		return flag;
		
	}
	
	public boolean checkNumber(int number) {
		
		int temp = number,rem1,rem2;
		while(temp>0)
		{
			rem1 = temp%10;
			temp = temp/10;
			rem2 = temp%10;
			if(rem1>rem2)
			{
				flag = true;
			}
		}
		
		return flag;
	}
	

}
