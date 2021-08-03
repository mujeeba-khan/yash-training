package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee e = new Employee("Abhay",1276521,2015,"INS2233");
		Employee e1 = new Employee("Abhay",1276521,2015,"INS2245");
		
		e.display();
		e1.display();
		
		System.out.println("Both the objects on the basis "
				+ "of insurance number are same: "+e.equals(e1));
	}

}
