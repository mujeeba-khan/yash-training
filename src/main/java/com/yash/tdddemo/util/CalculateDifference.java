package com.yash.tdddemo.util;

public class CalculateDifference {

	int difference;
	public int calculateDifference(String string) 
	{
		if(string=="")
		{
			difference=0;
		}
		
		return difference;
	}
	
	public int calculateDifference(int n) {
		int i,squareSum=0,sum=0,sqr;
		for(i=1;i<=n;i++)
		{
			squareSum = squareSum+(i*i);
			sum = sum+i;
		}
		sqr = sum*sum;
		difference = squareSum-sqr;
	return difference;
}

	
}
