package com.yash.javabasics.classassignments;



public class Range_Datatype {

	public int size; 
	
	public void range(String dt)
	{
		double range1,range2;
		if(dt.equalsIgnoreCase("byte"))
		{	size=1;  }
		else if(dt.equalsIgnoreCase("short"))
		{	size=2;  }
		else if(dt=="int")
		{	size=3;  }
		else if(dt=="long")
		{	size=4;  }
		
		range1 = Math.pow(-2,(size*8)-1);
		range2 = Math.pow(2,(size*8)-1)-1;
		
		System.out.print("Range of " + dt + " is from " + range1+ " to "+range2);
	}
	
}
