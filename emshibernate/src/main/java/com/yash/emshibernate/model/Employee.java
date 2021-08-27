package com.yash.emshibernate.model;
/*
 *  POJO Employee class 
 *  containing instance variables, constructors
 *  getters and toString() method
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue //auto generation of id
	@Column (name = "Id")
	private int id;
	
	@Column (name = "Name")
	private String name;
	
	@Column (name = "Salary")
	private double salary;
	
	@Column (name = "Department")
	private String department;
	
	@Column (name = "Designation")
	private String designation;
	
	@Column (name = "Address")
	private String address;
	
	public Employee() {
		super();
	}


	public Employee(int id, String name, double salary, String department, String designation, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
		this.address = address;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public void setAddress(String address) {
		this.address = address;
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

