package com.yash.emshibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.yash.emshibernate.model.Employee;



public class EmployeeApp {

	public static void main(String[] args)
	{
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction(); 

		Employee e = new Employee();
		
		/*
		//done using create in hbm2ddl
		 
		e.setName("Henry");
		e.setSalary(1237891);
		e.setDesignation("DSG#02");
		e.setDepartment("IT");
		e.setAddress("USA");
		session.save(e);
		*/
		
		/*
		//inserting multiple records using update in hbm2ddl
		 
		e.setName("William");
		e.setSalary(1237341);
		e.setDesignation("DSG#09");
		e.setDepartment("Testing");
		e.setAddress("USA");
		session.save(e);
		
		e.setName("Jenny");
		e.setSalary(124341);
		e.setDesignation("DSG#03");
		e.setDepartment("Testing");
		e.setAddress("USA");
		session.save(e);
		*/
		
		
		//updating records in the table
		//done using update in hbm2ddl
		
		e.setId(1);
		e.setName("Henry Abraham");
		e.setSalary(1237891);
		e.setDesignation("DSG#02");
		e.setDepartment("Testing");
		e.setAddress("USA");
		session.update(e);
		
		
		/*
		//deleting records from the table
		//done using update in hbm2ddl
		
		e.setId(3);
		session.delete(e);
		*/
		
		
		t.commit();
		System.out.println("\nSuccessfully saved");  
		
		
		//Retrieve and displaying a particular employee details.
		
		session.beginTransaction();
		
		//Query<Employee> query1 = session.createQuery("FROM Employee");
		//List<Employee> elist = query1.list();
		
		//Query<Employee> query1 = session.createQuery("FROM Employee E WHERE E.id = 1");
		//List<Employee> elist = query1.list();
		
		//Query<Employee> query1 = session.createQuery("FROM Employee E WHERE E.id > 1 ORDER BY E.salary DESC");
		//List<Employee> elist = query1.list();
		
		String hql = "FROM Employee E WHERE E.id = :empid";
		Query query1 = session.createQuery(hql);
		query1.setParameter("empid",2);
		List<Employee> elist = query1.list();
		
		System.out.println("\nRetrieving employee details");
		for(Employee object : elist)
		{
			System.out.println("Id : " + object.getId());
			System.out.println("Name : " + object.getName());
			System.out.println("Salary : " + object.getSalary());	
			System.out.println("Department : " + object.getDepartment());
			System.out.println("Designation : " + object.getDesignation());
			System.out.println("Address : " + object.getAddress());
			System.out.println();
		}
			
		session.getTransaction().commit();
		

		
	}

}
