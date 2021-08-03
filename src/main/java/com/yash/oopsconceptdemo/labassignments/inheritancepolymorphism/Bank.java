package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public class Bank {
	
	static Account acc[] = new Account[4];
	
	public void update()
	{
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i] instanceof SavingsAccount)
			{
				
			}
		}
		
	}
	
	public static void main(String args[])
	{
		
		for(int i=0;i<acc.length/2;i++)
		{
			acc[i] = new SavingsAccount("S124434",23.4);
		}
		
		for(int i=0;i<acc.length/2;i++)
		{
			acc[i] = new CurrentAccount("S1C344434",15);
		}
	}

}
