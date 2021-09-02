package com.yash.hibernate2;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
        //First Session Begins
        
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction(); 
        System.out.println(session.get(Person.class, 1l));
        Query query = session.createQuery("from Account where accountNumber =1").setCacheable(true).setCacheRegion("account");
        
        List<Account> personList = query.list();
        System.out.println(personList);
        t.commit();
        
        //First Session Ends
         
         
         
        //Second Session Begins
        SessionFactory factory1 = meta.getSessionFactoryBuilder().build();
		Session session1 = factory1.openSession();
		Transaction t1 = session1.beginTransaction(); 
        System.out.println(session1.get(Person.class, 1l));
        Query anotherQuery = session1.createQuery("from Account where accountNumber =1");
        anotherQuery.setCacheable(true).setCacheRegion("account");
        
        List<Account> personListfromCache = anotherQuery.list();
        System.out.println(personListfromCache);
        t1.commit();
        //Second Session Ends
         
        factory.close();
}
 

    
}
