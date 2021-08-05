package com.yash.java8;

public class Student
{
	int id;
	String name;
	String standard;
	String admissionDate;
	String dateOfBirth;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String standard, String admissionDate, String dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.admissionDate = admissionDate;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + ", admissionDate=" + admissionDate
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
		
	
	
}
