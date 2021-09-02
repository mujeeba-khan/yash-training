package com.yash.emshibernate1.model;

import javax.persistence.*;

@Entity
public class NewEmployee 
{
	@Id
	@Column (name = "Id" ,columnDefinition="INTEGER")
	private int id;
	
	@Column (name = "Name")
	private String name;

	public NewEmployee() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NewEmployee [id=" + id + ", name=" + name + "]";
	}
	
	
}
