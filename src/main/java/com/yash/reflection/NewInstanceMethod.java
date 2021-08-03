package com.yash.reflection;

public class NewInstanceMethod {
	
	int n;
	
	//public NewInstanceMethod() {} 
	
	// if default constructor is not present it give InstantiationException when we use newInstance method
	// coz newInstance() requires default constructor while it is getting invoked

	public NewInstanceMethod(int n) 
	{
		super();
		this.n = n;
	}
	
	public void show()
	{
		
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class c = Class.forName("com.yash.reflection.NewInstanceMethod");
		NewInstanceMethod ni = (NewInstanceMethod)c.newInstance();
		
		System.out.println("newInstance() got default constructor ");
	}

}
