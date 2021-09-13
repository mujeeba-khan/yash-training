package com.yash.springscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Student st=(Student) appContext.getBean("stud");
    
    	st.setName("Preet");
    	st.getName();
    	
    	Student st1=(Student) appContext.getBean("stud");
    	st1.getName();
    	
    }
}
