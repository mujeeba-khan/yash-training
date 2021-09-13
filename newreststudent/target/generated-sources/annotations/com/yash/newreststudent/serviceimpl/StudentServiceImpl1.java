package com.yash.newreststudent.serviceimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.yash.newreststudent.model.Student1;
import com.yash.newreststudent.service.StudentService;

public class StudentServiceImpl1
{

	public void addStudent() 
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config3.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction(); 

		Student1 st = new Student1();


		st.setId(2); 
		st.setName("William");
		st.setAddress("Indore");
		session.save(st);

	}

}
