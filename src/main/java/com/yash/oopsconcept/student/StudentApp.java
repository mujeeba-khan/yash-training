package com.yash.oopsconcept.student;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(123);
		s.setName("Abcd");
		System.out.println("Student id: "+s.getId()+"\nName: "+s.getName());
		
		Student s1 = new Student(12,"Preeti","Indore",20);
		s1.getDetails();
		
		SchoolStudent ss = new SchoolStudent();
		SchoolStudent ss1 = new SchoolStudent(32,"XYzfd","Bhopal",17,"XI","Dancing");
		System.out.println(ss1);
		
		ss1.show();

	}

}
