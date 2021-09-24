package com.yash.emsjpa.model;
/*
 *  POJO Employee class 
 *  containing instance variables, constructors
 *  getters setters and toString() method
 *  
 *  @author Mujeeba
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee 
{
	/* id stores the value of employee id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int id;
	
	/* name stores the value of employee name */
	
	@Column(name = "emp_name", nullable = false)
	private String name;
	
	/* salary stores the value of employee salary */
	
	@Column(name = "emp_salary", nullable = false)
	private double salary;
	
	/* department stores the value of employee department */
	
	@Column(name = "emp_department", nullable = false)
	private String department;
	
	/* designation stores the value of employee designation */
	
	@Column(name = "emp_designation")
	private String designation;
	
	/* address stores the value of employee address */

	@Column(name = "emp_address", nullable = false)
	private String address;
	
	/* default constructor */
	
	public Employee() {
		super();
	}

	/* parametrized constructor for initializing values to instance variables */
	
	public Employee(int id, String name, double salary, String department, String designation, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
		this.address = address;
	}


	/* setters for all instance variables */
	
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


	/* getters for all instance variables */
	
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


	/* toString() to print the object of employee */
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", designation=" + designation + ", address=" + address + "]\n";
	}
	
	
	
}
