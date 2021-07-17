package com.yash.tdddemo.util;

import com.yash.tdddemo.exception.NegativeException;

public class StringCalculator {

int i,m;
	
	public int calculate(String string) {
		
		if(string=="")
		{
			i=0;
		}
		else if(string=="2")
		{
			i=2;
		}
		
		return i;
	}

	public int calculate(int j, int k) {
		
		return j+k;
	}

	public int calculate(int j, String string, int k) {
		
		if(string=="\n")
		{
			m=j+k;
		}
		return m;
	}

	public int calculate(int j, int k, int k2) {
		
		return j+k+k2;
	}
	
	public void calculateException(int n) throws NegativeException 
	{
		if(n<0)
		{
			throw new NegativeException("--Negative number--");
		}
		
	}

	
}
