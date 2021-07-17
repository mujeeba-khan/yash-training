package com.yash.tdddemo.util;

import com.yash.tdddemo.exception.NegativeException;

public class CalculateSum {

	int sum;
	public int calculateSum(String string) 
	{
		
		if(string=="")
		{
			sum=0;
		}
		
		return sum;
	}
	
	public int calculateSum(int n) {
		
		if(n<3)
		{
			sum=0;
		}
		
		else 
		{
			int i;
			for(i=1;i<=n;i++)
			{
				if(i%3==0 || i%5==0)
				{
					sum = sum+i;
				}
			}
			
		}
		
		return sum;
	}
	
	public void calculateSumException(int n) throws NegativeException 
	{
		if(n<0)
		{
			throw new NegativeException("--Negative number--");
		}
		
	}
	
}
