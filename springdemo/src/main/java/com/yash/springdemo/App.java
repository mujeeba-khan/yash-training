package com.yash.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
        Customer c = (Customer) context.getBean("cust");
        
       // c.setId(12);
       // c.setName("Anjali");
        
       // System.out.println(c);
        
        c.displayInfo();
    }
}
