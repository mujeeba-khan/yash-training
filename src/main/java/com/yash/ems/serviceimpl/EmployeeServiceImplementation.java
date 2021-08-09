package com.yash.ems.serviceimpl;

/*
 * functionalities related to Employee are implemented here 
 * using java7 and java8 features
 */

import com.yash.ems.service.EmployeeService;
import com.yash.ems.exception.*;
import com.yash.ems.helper.SortBySalary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.yash.ems.model.Employee;

public class EmployeeServiceImplementation implements EmployeeService
{

	static LinkedList<Employee> empList = new LinkedList<Employee>();
	Scanner sc = new Scanner(System.in);
	Employee earr[];
	
	@Override
	public void getEmployeeList() {
		
		System.out.println("List of all employees\n"+empList);
		
	}
	
	@Override
	public void addEmployee() 
	{
		empList.add(new Employee(101,"Sam",23456,"HR","DSG#1","Indore"));
		empList.add(new Employee(112,"Ken",424234,"SalesAndMarketing","DSG#2","Indore"));
		empList.add(new Employee(203,"John",53456,"ProductDevelopment","DSG#3","Pune"));
		empList.add(new Employee(214,"Lily",142433,"HR","DSG#1","Pune"));
		empList.add(new Employee(321,"Amanda",434323,"AccountAndFinance","DSG#1","Indore"));
		empList.add(new Employee(414,"Lily",243253,"ProductDevelopment","DSG#1","Pune"));
		empList.add(new Employee(122,"Bella",567656,"HR","DSG#2","Indore"));
		empList.add(new Employee(322,"Edward",43434,"AccountAndFinance","DSG#3","Hyderabad"));
		empList.add(new Employee(123,"Jacob",876665,"HR","DSG#1","Hyderabad"));
		empList.add(new Employee(433,"William",666675,"ProductDevelopment","DSG#1","Pune"));
		
		
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
			
			System.out.println("Designation: ");
			String desig = sc.next();
			invalidDesignation(desig);
			
			System.out.println("Address: ");
			String address = sc.next();
			
			empList.addLast(new Employee(id,name,salary,dept,desig,address));
			earr = empList.toArray(new Employee[empList.size()]);
			
			System.out.println("\nRecord added successfully..");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void searchEmployeeById() throws EmployeeByIdNotFoundException
	{
			System.out.println("Enter the id: ");
			long id = sc.nextLong();
				
			if(empList.stream().anyMatch(e-> e.getId() == id))
			{
				empList.stream().filter(e-> e.getId() == id)
				.forEach(System.out::println);
			}
			else
			{
				throw new EmployeeByIdNotFoundException("Employee Id doesn't exist");
			}
			
		/*
			for(Employee e : earr)
			{
				if(e.getId()==id)
				{
					System.out.println(e);
				}
			}
				
			//throw new EmployeeByIdNotFoundException("Employee Id doesn't exist");
		*/	
			
	
	}


	@Override
	public void getEmployeesByDepartment()
	{
		System.out.println("Enter the department: ");
		String dept = sc.next();
		
		/*
		if(empList.stream().anyMatch(e-> e.getDepartment().equalsIgnoreCase(dept)))
		{
			empList.stream().filter(e-> e.getDepartment().equalsIgnoreCase(dept))
			.forEach(System.out::println);
		}
		
		*/
		
		for(Employee e : earr)
		{
			if(e.getDepartment().equalsIgnoreCase(dept))
			{
				System.out.println(e);
			}
		}
		
	}

	@Override
	public void removeEmployee() {
		/*
		System.out.println("Enter the id: ");
		long id = sc.nextLong();
		if(empList.stream().anyMatch(e-> e.getId() == id))
		{
			//empList.remove(e);
			System.out.println("Successfully removed \n");
		}
	*/
	
		System.out.println("Enter the id: ");
		long id = sc.nextLong();
		for(int i=0;i<earr.length;i++)
		{
			if(earr[i].getId()==id)
			{
				empList.remove(i);
				
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
				
				empList.set(i, new Employee(id,name,salary,dept,desig,address));
				
				System.out.println("Successfully updated \n");
			}
	    }
	}
	

	@Override
	public void getAllDepartments() {
		
		empList.stream()
        .map(Employee::getDepartment)
        .distinct()
        .forEach(System.out::println);
		
	}

	@Override
	public void getHighestPaidEmployee()
	{
		
	/*	empList.stream()
		.max((e1,e2)-> e1.getSalary() > e2.getSalary() ? 1 : -1)
		.ifPresent(System.out::println);
	*/	
		  System.out.println(empList.stream()
		  .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
		  .get());
		
		/*
		Collections.sort(empList, new SortBySalary());
		for(Employee e : empList)
		{
			System.out.println(e);
			break;
		}
		 */
	}
	
	

	@Override
	public void getEmployeeByNameAndSalary() throws EmployeeByNameAndSalaryNotFoundException
	{

		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Salary: ");
		double sal = sc.nextDouble();
		
		/*
		for(Employee e : earr)
		{
			if(e.getName().equals(name) && e.getSalary()==sal)
			{
				System.out.println(e);
			}
		}
		*/
		
		if(empList.stream()
		   .anyMatch(e -> (e.getName().equalsIgnoreCase(name)) && (e.getSalary()==sal)))
		{
			empList.stream()
			.filter(e -> (e.getName().equalsIgnoreCase(name)) && (e.getSalary()==sal))
			.forEach(System.out::println);
		}
		else
		{
			throw new EmployeeByNameAndSalaryNotFoundException("Employee with this name and salary deosn't exist");
		}
		
		
	}

	@Override
	public void getLimitedRecords()
	{
		System.out.println("Enter the limit");
		int i = sc.nextInt();
		empList.stream().limit(i).forEach(System.out::println);
	}
	
	
	public static void invalidId(long id) throws InvalidIdException, DuplicateIdException
	{
		if(id<=99)
		{
			throw new InvalidIdException("Employee Id should start from 100..");
		}
		/*
		for(Employee e : earr)
		{
			if(e.getId()==id)
			{
				throw new DuplicateIdException("Employee Id can't be duplicate..");
			}
		}
		*/
		
		if(empList.stream().anyMatch(e-> e.getId() == id))
		{
			throw new DuplicateIdException("Employee Id can't be duplicate..");
		}
	}
	
	
	public static void invalidDesignation(String designation) throws InvalidDesignationException
	{
		Pattern p = Pattern.compile("^(DSG#)[0-9]{2}$");
		Matcher m = p.matcher(designation);
		boolean flag = m.matches();
		if(!flag)
		{
			throw new InvalidDesignationException("Invalid designation...follow the pattern\n"
					+"eg: DSG#08");
		}
	}

}
