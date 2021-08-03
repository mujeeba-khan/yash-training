package com.yash.oopsconceptdemo;

public class LocalInnerClass 
{
	private double sal = 45676.57;

	void showSal()
	{
		class LocaInner
		{
			void showSalInner()
			{
				System.out.println(sal);
			}
		}
		
		//LocalInner i = new LocalInner();
		//i.showSalInner();
	}
	
	public static void main(String args[])
	{
		LocalInnerClass obj = new LocalInnerClass();
		obj.showSal();
	}
	
}
