package com.yash.ems.model;
/*
 *  POJO Employee class 
 *  containing instance variables, constructors
 *  getters and toString() method
 */

public class Employee 
{
	private long id;
	private String name;
	private double salary;
	private String department;
	private String designation;
	private String address;
	
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
				+ ", designation=" + designation + ", address=" + address + "]\n";
	}
	
	
	
}
