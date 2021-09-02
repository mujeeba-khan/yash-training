package com.yash.emshibernate1.model;

import javax.persistence.*; 

@Entity  
@Table(name = "employee101")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="employee")  
  
public class EmployeeSuper 
{  
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "id")  
	private int id;  
	  
	@Column(name = "name")  
	private String name;
	
	public EmployeeSuper() {
		super();
	}

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
		return "EmployeeSuper [id=" + id + ", name=" + name + "]";
	}  
	
	
  
}
