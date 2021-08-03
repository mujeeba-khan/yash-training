package com.yash.oopsconceptdemo;

public class StaticInnerClass 
{
	static int number = 56;
	static class Inner
	{
		void showNumber()
		{
			System.out.println(number);
		}
	}
	
	public static void main(String args[])
	{
		StaticInnerClass.Inner i = new StaticInnerClass.Inner();
		i.showNumber();
	}
}
