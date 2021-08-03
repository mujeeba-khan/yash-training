package com.yash.exceptionhandling;

import java.io.IOException;

public class Throws {
	
	//throws: used to declare an exception. Used mainly with checked exception
	
	 void method1() throws IOException
	 {  
		    throw new IOException("device error");//checked exception  	
	 }  
	 
	  void method2()
	  {  
		   try
		   {  
			   method1();
		   }
		   catch(Exception e)
		   {
			   System.out.println("exception handled");
		   }  
	  } 

	public static void main(String[] args) {

		Throws obj = new Throws();
		obj.method2();
		
	}

}
