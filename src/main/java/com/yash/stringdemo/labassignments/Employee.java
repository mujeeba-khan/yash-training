package com.yash.stringdemo.labassignments;

public class Employee {
	
	public String firstName;
	public String lastName;
	public String company;
	public String role;
	
	public Employee(String firstName, String lastName, String company, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.role = role;
	}
	
	public String generatePassword()
	{
		String fn2chars = firstName.substring(0, 2);
		String ln2chars = lastName.substring(0, 2);
		String com2chars = company.substring(0, 2);
		String ro2chars = role.substring(0, 2);
		
		String generatedpassword = "firstName- "+firstName+" lastName- "+lastName+" company- "+company+" role- "+role+" password- "+fn2chars+ln2chars+com2chars+ro2chars;
		return generatedpassword;
	}
	
	
}
