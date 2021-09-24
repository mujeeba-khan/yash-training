package com.yash.lifecyclemethodsspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
    	
    	
    	//LifeCycleMethods lc = (LifeCycleMethods) context.getBean("lifecycle");
    	//System.out.println(lc.getMsg());
    	
    	
    	LCMethods lc1 = (LCMethods) context.getBean("lcmethods");
    	System.out.println(lc1.getMsg());
    	((AbstractApplicationContext) context).registerShutdownHook();
    }
}
