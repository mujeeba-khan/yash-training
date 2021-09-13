package com.yash.springwithannot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Product product=appContext.getBean("product",Product.class);
    	System.out.println(product);
    }
}
