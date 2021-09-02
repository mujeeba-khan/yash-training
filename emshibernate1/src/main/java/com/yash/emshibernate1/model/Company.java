package com.yash.emshibernate1.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Company")
public class Company
{
	@Id
	@Column(name="Company_id")
	private int c_id;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@Column(name="Employees")
    private Set<Employee> employees = new HashSet<Employee>();
	
	public Company() {}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [c_id=" + c_id + ", employees=" + employees + "]";
	}
	
	

}
