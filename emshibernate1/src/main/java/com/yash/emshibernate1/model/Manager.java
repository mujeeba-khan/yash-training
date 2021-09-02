package com.yash.emshibernate1.model;

import javax.persistence.*;

@Entity
@Table(name = "manager")
public class Manager
{
	@Id
    @Column(name = "id")
    private int id;
	
	@Column(name = "name")
    private String name;
	
	@OneToOne
	private Department dept;
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
