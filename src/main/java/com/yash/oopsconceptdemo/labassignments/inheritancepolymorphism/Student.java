package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public class Student {

	String name;
	int age;
	String address;
	
	public Student()
	{
		this.name = "unknown";
		this.age = 0;
		this.address = "not available";
	}
	
	public void setInfo(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void setInfo(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	

	public void display()
	{
		System.out.println("Name: "+name+"\nAge: "+age+"\nAddress: "+address);
	}
	
}
