package com.yash.hibernateannot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class StoreStudentData 
{
	public static void main(String[] args) {  

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction(); 

		Student s=new Student();
		
		
		s.setId(17);  
		s.setName("clary");  //when creating table
		
		/*
		s.setId(20);  
		s.setName("William"); //when validating table(structure)
		
		
		s.setId(28);  
		s.setName("Jerry"); //when updating table
		s.setAddress("USA");
		
		
		s.setId(30); 
		s.setName("Isha");	//when applying create-drop
		s.setAddress("USA");
		*/
		
		session.save(s);
		t.commit();
		System.out.println("successfully saved");  
		//factory.close();
		//session.close();  

	}
}
