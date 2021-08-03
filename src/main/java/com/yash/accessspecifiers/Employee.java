package com.yash.accessspecifiers;

public class Employee {
	
	public int id;
	protected String name;
	private double salary;
	int age;
	
	//every instance variables is accessible inside its class
	
	Employee(){}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("Details:\n"+id+"\n"+name+"\n"+salary);
		System.out.println("Salary: "+salary); //salary is private so can be accessed inside its class only
	}
	

}
