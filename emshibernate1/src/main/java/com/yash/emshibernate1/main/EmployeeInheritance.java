package com.yash.emshibernate1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.emshibernate1.model.*;

public class EmployeeInheritance {

	public static void main(String[] args) 
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config2.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction(); 
		
		EmployeeSuper e1  = new EmployeeSuper();
		e1.setName("Milly");
		
		RegularEmployee e2=new RegularEmployee();    
		e2.setName("Natasha Sharma");    
		e2.setSalary(65430);    
		e2.setBonus(5);    

		ContractEmployee e3=new ContractEmployee();    
		e3.setName("Kapil Jain");    
		e3.setPay_per_hour(4000);    
		e3.setContract_duration("15 hours");    

		session.save(e1);    
		session.save(e2);    
		session.save(e3);    

		t.commit();    
		session.close();    
		System.out.println("success");       

	}

}
