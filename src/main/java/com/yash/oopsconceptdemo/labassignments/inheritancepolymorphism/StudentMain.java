package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
			System.out.println("Enter student details: ");
			Student st[] = new Student[10];
			
			
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<10;i++)
			{
				System.out.println("For student "+(i+1));
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Age: ");
				int age = sc.nextInt();
				System.out.println("Address: ");
				String address = sc.next();
				st[i] = new Student();
				st[i].setInfo(name, age, address);
			}
			
			System.out.println("Student details are: ");
			for(int i=0;i<10;i++)
			{
				System.out.println("Student "+(i+1)+" -");
				st[i].display();
			}
	}

}
