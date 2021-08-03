package com.yash.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class Sample extends Thread
{
	public void run()
	{
		Logger log = Logger.getLogger(LogDemo.class);
		PropertyConfigurator.configure("src/main/resources/log4j.properties");
		System.out.println();
		log.info("Hello people");
		log.info("we are in logger info mode");
		log.warn("Warning msg");
		log.error("Error msg");
	}
	
}

public class LogDemo 
{

	static Logger log = Logger.getLogger(LogDemo.class);
	public static void main(String[] args) 
	{
		try 
		{	
			  PropertyConfigurator.configure("src/main/resources/log4j.properties");
			  log.info("Hello people");
			  log.warn("Warning msg");
			  log.error("Error msg");
			  log.fatal("Fatal msg");
			  log.debug("Debugg msg");
			
			  Sample t1 = new Sample();
			  t1.start();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

}
