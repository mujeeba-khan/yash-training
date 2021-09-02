package com.yash.emshibernate1.model;

import javax.persistence.*;

@Entity
@Table(name = "Department")
public class Department 
{
	 @Id
	 @Column(name = "id")
	 private int dept_id;
	 
	 @Column(name = "name")
	 private String dept_name;
	 
	 @OneToOne
	 private Manager manager;
	 
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public int getDept_id() {
		return dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", manager=" + manager + "]";
	}
	 
	 
}
