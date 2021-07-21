package com.yash.javabasics.labassignments;

public class Exercise6 {

	public int calculateDifference(int n)
	{
		int difference=0,i,squareSum=0,sum=0,sqr;
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
