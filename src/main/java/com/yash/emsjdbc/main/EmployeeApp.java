package com.yash.emsjdbc.main;

/*
 * EmployeeApp : main class to execute Employee Management System
 * where user will get the choices to go ahead
 */

import java.util.Scanner;

import com.yash.emsjdbc.exception.*;
import com.yash.emsjdbc.serviceimpl.EmployeeServiceImpl;
import com.yash.emsjdbc.daoimpl.EmployeeDaoImpl;

public class EmployeeApp {

	public static void main(String[] args)
	{
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		EmployeeDaoImpl edao = new EmployeeDaoImpl();
		Scanner sc =  new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("\n-----Welcome to EMS-------\n");
			System.out.println(
					 "Press 1 to add an employee record\n"
					+"Press 2 to get the list of all employees\n"
					+"Press 3 to search an employee by id\n"
					+"Press 4 to get employees by department\n"
					+"Press 5 to update an employee record\n"
					+"Press 6 to remove an employee record\n"
					+"Press 7 to get all departments\n"
					+"Press 8 to get highest paid employee\n"
					+"Press 9 to get employee by name and salary\n"
					+"Press 10 to get limited records\n"
					+"Press 11 to exit");
		
			int choice = sc.nextInt();

			switch(choice)
			{
				case 1:
					edao.addEmployee();
					break;
					
				case 2:
					edao.getEmployeeList();
					break;
					
				case 3:
				try
				{
					esi.searchEmployeeById();
				} catch (EmployeeByIdNotFoundException e)
				{
					e.printStackTrace();
				}
					break;
					
				case 4:
					esi.getEmployeesByDepartment();
				
					break;
					
				case 5:
					edao.updateEmployee();
					break;
					
				case 6: 
					edao.removeEmployee();
					break;
					
				case 7: 
					esi.getAllDepartments();
					break;
					
				case 8: 
					esi.getHighestPaidEmployee();
					break;
					
				case 9: 
				try 
				{
					esi.getEmployeeByNameAndSalary();
				} catch(EmployeeByNameAndSalaryNotFoundException e) 
				{	
					e.printStackTrace();
				}
					break;
					
				case 10:
					esi.getLimitedRecords();
					break;
					
				case 11: 
					System.exit(0);
					
				default:
					System.out.println("Wrong choice entered...");
					break;
			}
		}
		
	}

}
