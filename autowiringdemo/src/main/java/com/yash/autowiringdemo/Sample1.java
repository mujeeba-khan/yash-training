package com.yash.autowiringdemo;


public class Sample1 
{
	private Sample2 s2;

	public Sample1()
	{
		System.out.println("Sample 1 is created..");
	}
	
	public Sample1(String a)
	{
		a="John";
		System.out.println("Hello "+a);
	}
	
	public Sample1(String a, String b)
	{
		a="John"; b="Bob";
		System.out.println("Hello "+a+" ,"+b);
	}
	
	public Sample2 getS2() {
		return s2;
	}

	public void setS2(Sample2 s2) {
		this.s2 = s2;
	}
	
	public void print()
	{
		System.out.println("Welcome in Sample 1");
	}
	
	public void display()
	{
		print();
		s2.print();
		
	}
	
	
}
