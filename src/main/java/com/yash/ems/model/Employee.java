package com.yash.ems.model;

public class Employee 
{
	long id;
	String name;
	double salary;
	String department;
	String designation;
	String address;
	
	
	public Employee() {
		super();
	}


	public Employee(long id, String name, double salary, String department, String designation, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
		this.address = address;
	}


	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public String getDepartment() {
		return department;
	}


	public String getDesignation() {
		return designation;
	}


	public String getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", designation=" + designation + ", address=" + address + "]";
	}
	
	
	
}
