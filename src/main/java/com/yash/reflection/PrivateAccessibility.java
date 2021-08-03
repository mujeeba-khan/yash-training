package com.yash.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateAccessibility {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {


		Class c = Class.forName("com.yash.reflection.Employee");
		System.out.println("Class name: "+c+"\n");
		
		Constructor ct[] = c.getDeclaredConstructors(); 
		System.out.println("Constructors: \n");
		for(Constructor c1 : ct)
		{
			System.out.println(c1+"\n");
		}
		
		ct[0].setAccessible(true);
		
		Employee emp = (Employee)ct[0].newInstance();
		
		System.out.println("Private constructor : "+emp);

	}

}
