package com.yash.emshibernate1.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.yash.emshibernate1.model.*;

public class CompanyApp 
{

	public static void main(String[] args) 
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction(); 

		Manager mng = new Manager();
		
		Department d = new Department();
		
		Company c = new Company();
		
		Employee e1  = new Employee();
		Employee e2  = new Employee();
		Employee e3  = new Employee();
		
		c.setC_id(231);
		
		/*
		d.setDept_id(453);
		d.setDept_name("HR");
		
		mng.setId(134);
		mng.setName("Suman");
		
		d.setManager(mng);
		mng.setDept(d);
		*/
		
		e1.setId(1);
		e2.setId(2);
		e3.setId(3);
		
		c.getEmployees().add(e1);
		c.getEmployees().add(e2);
		c.getEmployees().add(e3);
		
		
		Project p1 = new Project();
		p1.setPid(10);
		p1.setPname("EMS");

		Project p2 = new Project();
		p2.setPid(15);
		p2.setPname("HMS");
		
		
		/*
		session.save(d);
		session.save(mng);
		*/
		
		/*
		Vehicles v1 = new Vehicles();
        Vehicles v2 = new Vehicles();
        
        v1.setVehicleName("Car");
        v1.getEmployees().add(e1);
        v1.getEmployees().add(e2);
        v1.getEmployees().add(e3);
        
        v2.setVehicleName("Jeep");
        v2.getEmployees().add(e1);
        v2.getEmployees().add(e2);
        v2.getEmployees().add(e3);
        
        
        e1.getVehicle().add(v1);
        e1.getVehicle().add(v2);
        e2.getVehicle().add(v1);
        e2.getVehicle().add(v2);
        e3.getVehicle().add(v1);
        e3.getVehicle().add(v2);
        */
		
		
        e1.getLisOfProjects().add(p1);
        e2.getLisOfProjects().add(p2);
        
		
        session.save(e1);
		session.save(e2);
		session.save(e3);
        
		session.save(c);
		
        //session.save(v1);
        //session.save(v2);
        
		System.out.println("\nSuccessfully saved\n");
		
		//d = (Department) session.get(Department.class, 897); 
		//System.out.println(d);
		
		t.commit();
		session.close();
		
		
		session = factory.openSession(); // again create another session object
		e2 = null;
		e2 = (Employee) session.get(Employee.class, 1);
		session.close();
		System.out.println(e2.getLisOfProjects().size());
		
		factory.close();
		

	}

}
