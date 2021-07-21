package com.yash.javabasics.labassignments;

public class Exercise7 {

	public boolean checkNumber(int number)
	{
		boolean flag=false;
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
