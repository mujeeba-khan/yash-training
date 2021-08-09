package com.yash.collectionassignment1.model;

public class Employee 
{
	int eid;
	String firstName;
	String lastName;
	String department;
	
	
	public Employee() {
		super();
	}


	public Employee(int eid, String firstName, String lastName, String department) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + "]";
	}
	
	
}
