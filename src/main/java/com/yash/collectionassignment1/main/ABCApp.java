package com.yash.collectionassignment1.main;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import com.yash.collectionassignment1.model.Employee;
import com.yash.collectionassignment1.model.Product;

public class ABCApp {

	public static void main(String[] args)
	{
		//unique names set
		LinkedHashSet<String> fname = new LinkedHashSet<String>();
		fname.add("Arjun");
		fname.add("Needhi");
		fname.add("Palak");
		fname.add("Abhay");
		fname.add("Aliza");
		
		System.out.println("First names of employees: \n"+fname);
		
		//waiting list of employees for sport
		LinkedList<Employee> waitingList = new LinkedList<Employee>();
		
		Employee e1 = new Employee(1,"Arjun","Jain","Accounts");
		Employee e2 = new Employee(2,"Needhi","Jain","Accounts");
		Employee e3 = new Employee(3,"Arjun","Sharma","HR");
		Employee e4 = new Employee(4,"Abhay","Chopra","IT");
		Employee e5 = new Employee(5,"Aliza","Khan","IT");
		waitingList.add(e1);
		waitingList.add(e2);
		waitingList.add(e3);
		waitingList.add(e4);
		waitingList.add(e5);

		System.out.println("Waiting list of employees: \n"+waitingList);
		
		//updating list at second position: index 1
		waitingList.set(1, new Employee(12,"Bhavesh","Kumar","IT"));
		
		System.out.println("\nUpdated Waiting list of employees: \n"+waitingList);
		
		//list of product as per allocation
		LinkedHashSet<Product> pro = new LinkedHashSet<Product>();
		pro.add(new Product(12,"P1",5326));
		pro.add(new Product(23,"P2",745));
		pro.add(new Product(28,"P3",7984));
		pro.add(new Product(42,"P4",5216));
		
		System.out.println("\nProduct's list: \n"+pro);
	}

}
