package com.yash.oopsconcept.student;

public class Student {
	
	int id;
	String name;
	String city;
	int age;
	
	public Student() {}
	
	public Student(int id, String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student(int id, String name, String city, int age) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
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

	
	void getDetails() //getter method
	{
		System.out.println("Student details are: \nStudent id: "+id+"\nStudent name: "+name +"\nCity: "+city+"\nAge: "+age);
	}
	

	void show()
	{
		System.out.println("Hello I am a Student");
	}
}
