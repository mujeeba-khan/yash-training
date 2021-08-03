package com.yash.collectionassignment4.model;

import java.io.Serializable;

public class Employee implements Serializable
{
	int id;
	String name;
	double salary;
	String designation;
	String department;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, String designation, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", department=" + department + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	public String getDepartment() {
		return department;
	}
	
	
	
}
