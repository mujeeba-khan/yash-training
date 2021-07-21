package com.yash.stringdemo.labassignments;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee(args[0],args[1],args[2],args[3]);
		String generatedpassword = emp.generatePassword();
		System.out.println(generatedpassword);

	}

}
