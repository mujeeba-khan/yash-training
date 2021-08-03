package com.yash.io.labassignments;

import java.io.Serializable;

public class Employee implements Serializable
{
	int id;
	String name;
	double salary;
	String designation;
	String date_Of_Joining;
	
	public Employee(int id, String name, double salary, String designation, String date_Of_Joining) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.date_Of_Joining = date_Of_Joining;
	}
	
	
}
