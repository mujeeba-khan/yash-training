package com.yash.oopsconcept.student;

public class SchoolStudent extends Student{

	String student_Class;
	String school_Club;
	
	public SchoolStudent() {System.out.println("SChoolStudent constructor");}

	public SchoolStudent(int id, String name, String city, int age, String student_Class, String school_Club) {
		super(id, name, city, age);
		this.student_Class = student_Class;
		this.school_Club = school_Club;
	}

	@Override
	public String toString() {
		return "SchoolStudent [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", student_Class="
				+ student_Class + ", school_Club=" + school_Club + "]";
	}

	public void show()
	{
		super.show();
		System.out.println("Specifically I am a School Student");
	}
	
	
}
