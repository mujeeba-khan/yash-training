package com.yash.javabasics.classassignments;

public class TypeCasting {

	public static void main(String[] args) {
		
	    // Implicit/Upcasting: happens automatically
	    // when lower datatypes are upcasted to higher data types
		
		System.out.println("Upcasting-");
		int i = 9;
	    double d = i; 
	    
	    System.out.println("Int: "+i);     
	    System.out.println("Double: "+d); 
	    
	    byte b = 12;
	    int i1 = b;
	    
	    System.out.println("\nByte: "+b);     
	    System.out.println("Int: "+i1); 
	    


	    // Explicit/Downcasting: happens manually
	    // when higher datatypes are downcasted to lower data types

	    System.out.println("\nDowncasting-");
	    double d2 = 13.4;
	    int i2 = (int)d2;
	    
	    System.out.println("Double: "+d2);     
	    System.out.println("Int: "+i2); 
	    
	    float f = 219.3f;
	    short s = (short)f;
	    
	    System.out.println("\nFloat: "+f);     
	    System.out.println("Short: "+s); 
	    
	}

}
