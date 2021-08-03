package com.yash.oopsconceptdemo;

public class ClassCastException {

	public static void main(String[] args) {
		
	/*	Object o = new Object();
		String s = (String)o;
		
		//ClassCastException - as parent class object cant be converted to child type
	*/
		
		  String s1 = "Hello";
          Object o1 = (Object)s1;
          System.out.println(o1);
          
          // No exception - as child class object can be converted to its parent type 
		
	}

}
