package com.yash.exceptionhandling;

public class Throw {
	
	//throw is mainly used to throw custom exception inside methods
	
	public void voting(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not an eligible voter!!");
		}
		else
		{
			System.out.println("Eligible to vote!!");
		}
	}

	public static void main(String[] args) { //caller 
		
		Throw th = new Throw();
		th.voting(16); //callee
		System.out.println("Its Election Time..");
	}

}
