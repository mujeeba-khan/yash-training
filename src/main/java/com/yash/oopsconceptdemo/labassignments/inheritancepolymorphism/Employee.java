package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

import java.util.Objects;

public class Employee extends Person
{
	double salary;
	int starting_Year;
	String insurance_Number;
	
	public Employee(String name, double salary, int starting_Year, String insurance_Number) {
		super(name);
		this.salary = salary;
		this.starting_Year = starting_Year;
		this.insurance_Number = insurance_Number;
	}
	
	
	
	public double getSalary() {
		return salary;
	}



	public int getStarting_Year() {
		return starting_Year;
	}



	public String getInsurance_Number() {
		return insurance_Number;
	}



	public void display()
	{
		System.out.println("Name: "+name+"\nSalary: "+salary+"\nStarting year: "
	+starting_Year+"Insurance number: "+insurance_Number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(insurance_Number, other.insurance_Number);
	}
	
	
}
