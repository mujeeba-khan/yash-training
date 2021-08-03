package com.yash.exceptionhandling;

public class CallStackOfException {

	  void method1()
	  {  
	    int data=12/0;  // exception occurred : not caught, dropped down
	  }  
	  void method2()
	  {  
		  method1();  // exception : dropped here, not caught, dropped down 
	  }  
	  void method3()
	  {  
		  try
	      {  
			  method2(); // exception: handled
		  }
		  catch(Exception e)
		  {
			  System.out.println("exception handled");
		  }  
	   }  
		
	
	  public static void main(String[] args) {

		  CallStackOfException cse = new CallStackOfException();
		  cse.method3();
		  
	}

}
