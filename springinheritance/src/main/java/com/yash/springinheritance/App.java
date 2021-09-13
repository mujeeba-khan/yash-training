package com.yash.springinheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Employee emp=(Employee) appContext.getBean("employee");
    	System.out.println("Employee id:"+emp.getEid());
    	System.out.println("Employee name:"+emp.getName());

    }
}
