package com.yash.collectionassignment5.model;

public class Student 
{
	int id;
	String name;
	String standard;
	
	
	public Student() {
		super();
	}


	public Student(int id, String name, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
	}

	

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getStandard() {
		return standard;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + "]";
	}
	
	
	
}
