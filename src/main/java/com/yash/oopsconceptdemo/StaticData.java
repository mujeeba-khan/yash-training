package com.yash.oopsconceptdemo;

public class StaticData {

	static int num=98;
	String name;
	
	public StaticData(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	static void display()
	{
		System.out.println("Hello");
	}
	
	private void getDetails() {
		// TODO Auto-generated method stub
		System.out.println(num+" "+name);
	}
	
	public static void main(String[] args)
	{
		//StaticData d = new StaticData(1,"Yash");
		//d.getDetails();
		System.out.println(num); //static variable accessed without object
		display();
	}


	
	
}
