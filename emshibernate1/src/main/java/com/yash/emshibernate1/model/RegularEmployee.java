package com.yash.emshibernate1.model;

import javax.persistence.*;

@Entity  
@DiscriminatorValue("regularemployee")  
public class RegularEmployee extends EmployeeSuper
{  
      
	@Column(name="salary")    
	private double salary;  
	  
	@Column(name="bonus")     
	private int bonus;
	
	public RegularEmployee() {}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}  
	
	
 
}