package com.yash.emshibernate1.main;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.emshibernate1.model.NewEmployee;

public class EmployeeApp {

	public static void main(String[] args) 
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config3.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction(); 
		
		NewEmployee e1  = new NewEmployee();
		NewEmployee e2  = new NewEmployee();
		NewEmployee e3  = new NewEmployee();
		
		/*
		e1.setId(1);
		e1.setName("Henry");
		session.save(e1);
		*/
		
		//-----inserting multiple records-----
		// using update in hbm2ddl
		e2.setId(2); 
		e2.setName("William");
		session.save(e2);
		
		e3.setId(3);
		e3.setName("Jenny");
		session.save(e3);
		
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<NewEmployee> query = builder.createQuery(NewEmployee.class);
		Root<NewEmployee> root = query.from(NewEmployee.class);
		query.select(root);
		Query q = session.createQuery(query);
		List<NewEmployee> elist = q.getResultList();
		for(NewEmployee e : elist)
		{
			System.out.println("Name: "+e.getName());
		}
		
		/*
		 * it will loads the object 1 from the database only as its the first time,
		 *  and keeps this object in the session cache
		 *  
		 *   i tried to load object number 2,3,4 the same object 3 times, but here
		 *   the object will be loaded from the stored cache only not from the
		 *   database, as we are in the same session
		 */
		
		Object ob1 = session.get(NewEmployee.class, new Integer(1));
		Object ob2 = session.get(NewEmployee.class, new Integer(1));
		Object ob3 = session.get(NewEmployee.class, new Integer(1));
		Object ob4 = session.get(NewEmployee.class, new Integer(1));
		
		t.commit();
		session.close();
		
		/*
		 * Again I created one new session and loaded the
		 * same object with id 1, but this time hibernate 
		 * will loads the object from the database
		 * 
		 * number of sessions = that many number of cache memories
		 */
		Session ses2 = factory.openSession();
		Object ob5 = ses2.get(NewEmployee.class, new Integer(1));
	}

}
