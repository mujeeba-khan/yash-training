package com.yash.logging;

import java.util.InputMismatchException;

import org.apache.log4j.Logger;

public class LogInfo 
{

	static Logger log = Logger.getLogger(LogInfo.class);
	
	public static void add(int arr[])
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total += arr[i];
		}
		log.info("Sum of array elements are: "+total);
	}
	
	public static void div(int a, int b)
	{
		int d = a/b;
		log.info("Division: "+d);
		
	}

	public static void main(String[] args) 
	{
		try 
		{
			int arr[] = new int[5];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=Integer.parseInt(args[i]);
			}
			
			add(arr);
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			div(a,b);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			log.warn("You have entered values beyond the limit of array..");		
		}
		catch(ArithmeticException e)
		{
			log.error("Number can't be divided by zero..");		
		}
		catch(NumberFormatException | InputMismatchException e)
		{
			log.fatal("Only numbers are allowed..");		
		}
			
		log.debug("Undergoing debugging..");
	}

}
