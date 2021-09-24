package com.yash.ems.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.yash.ems.model.Employee;

public class HibernateConfig 
{
	//private SessionFactory sf;
	
	public Session getSession() 
	{
		try 
		{
			/*
			Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
			this.sf=cfg.buildSessionFactory();
			return this.sf.openSession();	
			*/
			
			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
			Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

			SessionFactory factory = meta.getSessionFactoryBuilder().build();
			Session session = factory.openSession();
			return session;
			
		} catch (Exception e) {
			System.err.println("Hibernate configuration failed");
			e.printStackTrace();
		}
		return null;		
	}
}
