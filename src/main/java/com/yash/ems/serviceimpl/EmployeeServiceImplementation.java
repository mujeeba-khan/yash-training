package com.yash.ems.serviceimpl;

import com.yash.ems.service.EmployeeService;
import com.yash.ems.exception.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.yash.ems.model.Employee;

public class EmployeeServiceImplementation implements EmployeeService
{

	List<Employee> emplist = new ArrayList<Employee>(20);
	Scanner sc = new Scanner(System.in);
	Employee earr[];
	
	@Override
	public void getEmployeeList() {
		
		System.out.println("List of all employees\n"+emplist);
		
	}
	
	@Override
	public void addEmployee() 
	{
		try 
		{
			System.out.println("Enter the details: ");
			System.out.println("Id: ");
			long id = sc.nextLong();
			invalidId(id);
			
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			System.out.println("Department: ");
			String dept = sc.next();
			invalidDepartmentName(dept);
			
			System.out.println("Designation: ");
			String desig = sc.next();
			System.out.println("Address: ");
			String address = sc.next();
			
			emplist.add(new Employee(id,name,salary,dept,desig,address));
			
			earr = emplist.toArray(new Employee[emplist.size()]);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void searchEmployeeById() {
		
		System.out.println("Enter the id: ");
		long id = sc.nextLong();
		for(Employee e : earr)
		{
			if(e.getId()==id)
			{
				System.out.println(e);
			}
			else
			{
				System.out.println("Not present \n");
			}
		}
		
	}



	@Override
	public void searchEmployeeByDepartment() {
		System.out.println("Enter the department: ");
		String dept = sc.next();
		
		for(Employee e : earr)
		{
			if(e.getDepartment().equals(dept))
			{
				System.out.println(e);
			}
			else
			{
				System.out.println("Not present \n");
			}
		}
		
		
	}

	@Override
	public void removeEmployee() {
	
		System.out.println("Enter the id: ");
		long id = sc.nextLong();
		for(int i=0;i<earr.length;i++)
		{
			if(earr[i].getId()==id)
			{
				emplist.remove(i);
				
				System.out.println("Successfully removed \n");
			}
		}
		
	}

	@Override
	public void updateEmployee() {

		System.out.println("Enter id: ");
		long id = sc.nextLong();
		
		for(int i=0;i<earr.length;i++)
		{
			if(earr[i].getId()==id)
			{
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Salary: ");
				Double salary = sc.nextDouble();
				System.out.println("Department: ");
				String dept = sc.next();
				System.out.println("Designation: ");
				String desig = sc.next();
				System.out.println("Address: ");
				String address = sc.next();
				
				emplist.set(i, new Employee(id,name,salary,dept,desig,address));
				
				System.out.println("Successfully updated \n");
			}
			
	    }
			
		
	}
	
	public static void invalidId(long Id) throws InvalidIdException
	{
		if(Id<=99)
		{
			throw new InvalidIdException("Employee Id should start from 100..");
		}
	}
	
	public static void invalidDepartmentName(String department) throws InvalidDepartmentNameException
	{
		Pattern p = Pattern.compile("^(DEPT#)[0-9]*$");
		Matcher m = p.matcher(department);
		boolean flag = m.matches();
		if(!flag)
		{
			throw new InvalidDepartmentNameException("Invalid department name...follow the pattern");
		}
	}

}
