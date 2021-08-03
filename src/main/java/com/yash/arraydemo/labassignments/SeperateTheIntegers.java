package com.yash.arraydemo.labassignments;

import java.util.Scanner;

public class SeperateTheIntegers {

	String searching=null;
	public String seperateIntegers(String string) 
	{
		if(string=="")
		{
			searching="Not found";
		}
		return searching;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] values = new int[6];
		int pos=0,neg=0,odd=0,even=0,zero=0;
		System.out.println("Enter 20 integer values: \n");
		for(int i=0;i<values.length;i++)
		{
			values[i] = sc.nextInt();
		}
		
		for(int i=0;i<values.length;i++)
		{
			if(values[i]>0)
			{
				pos++;
			}
			else if(values[i]<0)
			{
				neg++;
			}
			else if(values[i]==0)
			{
				zero++;
			}
			if(values[i]%2==0)
			{
				even++;
			}
			else if(values[i]%2!=0)
			{
				odd++;
			}
		}
		
		System.out.println("Number of Positive no.s are: "+pos+"\nNumber of Negative no.s are: "+neg+
				"\nNumber of Zeroes are: "+zero+"\nNumber of Odd no.s are: "+odd+"\nNumber of Even no.s are: "+even);
		
	}


}
