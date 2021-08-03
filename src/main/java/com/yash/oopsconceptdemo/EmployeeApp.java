package com.yash.oopsconceptdemo;

import com.yash.accessspecifiers.Employee;

public class EmployeeApp {
	
	public static void main(String args[])
	{
		Employee e = new Employee(1,"Abc",12300);
		e.display();
		
		/*
		System.out.println("Age: "+e.age); //age is default - cant be accessed outside the package
		System.out.println("Name: "+e.name); //protected: outside the pkg only if it is aceessed via its child class
		System.out.println("ID"+e.id); //public can be accessible everywhere
		*/
	}

}
