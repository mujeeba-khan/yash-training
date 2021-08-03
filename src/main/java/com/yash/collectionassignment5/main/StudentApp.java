package com.yash.collectionassignment5.main;

import java.util.Stack;
import java.util.Vector;

import com.yash.collectionassignment5.model.Student;

public class StudentApp {

	public static void main(String[] args) 
	{
		
		Vector<Student> vec = new Vector<Student>();
		
		Student s1 = new Student(231,"S1","XII");
		vec.add(s1);
		vec.add(new Student(12,"S2","XI"));
		vec.add(new Student(87,"S3","IX"));
		
		System.out.println("Size of the student vector: "+vec.size());
		
		System.out.println("Initial Capacity of the student vector: "+vec.capacity());
		
		System.out.println("Whether vector contains the student with roll no. 231: "
		+vec.contains(s1));
		
		System.out.println("Second student record: \n"+vec.get(1));
		
		Student s2 = new Student(87,"S3","VII");
		vec.setElementAt(s2, 2);
		System.out.println("Setting 3rd student standard: \n"+vec.get(2));
		
		
		Stack<Student> st = new Stack<Student>();
		st.push(s1);
		st.push(s2);
		st.push(new Student(65,"S4","V"));
		
		System.out.println("Student records in stack...\n");
		Student s = (Student)st.pop();
		System.out.println(s);
	}

}
