package com.yash.ems.main;

import java.util.Scanner;
import com.yash.ems.serviceimpl.EmployeeServiceImplementation;

public class EmployeeApp {

	public static void main(String[] args)
	{
		EmployeeServiceImplementation esi = new EmployeeServiceImplementation();
		Scanner sc =  new Scanner(System.in);
		
		//do
		while(true)
		{
			System.out.println("\n-----Welcome to EMS-------\n");
			System.out.println(
					 "Press 1 to add an employee record\n"
					+"Press 2 to get the list of employees\n"
					+"Press 3 to search an employee by id\n"
					+"Press 4 to search an employee by department\n"
					+"Press 5 to update an employee record\n"
					+"Press 6 to remove an employee record\n"
					+"Press 7 to exit");
		
			int choice = sc.nextInt();

		
			switch(choice)
			{
				case 1:
					esi.addEmployee();
					break;
				case 2:
					esi.getEmployeeList();
					break;
				case 3:
					esi.searchEmployeeById();
					break;
				case 4:
					esi.searchEmployeeByDepartment();
					break;
				case 5:
					esi.updateEmployee();
					break;
				case 6: 
					esi.removeEmployee();
					break;
				case 7: 
					System.exit(0);
				default:
					System.out.println("Wrong choice entered...");
					break;
			}
		}
		//while(true);
	}

}
