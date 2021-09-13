package com.yash.autowiringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
        Sample1 s = (Sample1) context.getBean("s1");
        s.display();
    }
}
