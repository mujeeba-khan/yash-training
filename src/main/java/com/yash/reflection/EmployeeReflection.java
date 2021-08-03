package com.yash.reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class EmployeeReflection {

	public static void main(String[] args) throws ClassNotFoundException {

		//implementing different classes of reflect package

		Class c = Class.forName("com.yash.reflection.Employee"); // loads the mentioned class in the class loader
		System.out.println("Class : "+c+"\n");
		
		System.out.println("\nSuper class: "+c.getSuperclass()+"\n");
		
		int mod = c.getModifiers();
		System.out.println("\nInteger value assigned to modifiers: "+mod+"\n");
		
		System.out.println("Access Modifier: "+Modifier.toString(mod));
		
		Class[] interfaces = c.getInterfaces(); // get the interfaces implemented by the class
		System.out.println("\nInterfaces : ");
		for(Class intf : interfaces)
		{
			System.out.println(intf+" - hashcode - "+intf.hashCode()+"\n");
		}
		
		Field[] f = c.getFields(); // get fields of super class 
		System.out.println("\nFields of super class: "+f.length+"\n");
		
		Field[] f1 = c.getDeclaredFields(); // get fields of current class 
		System.out.println("\nFields of Employee: "+f1.length+"\n");
		
		 for(Field f2: f1) {
		      System.out.print("\nField data type: "+f2.getType());
		      System.out.println("\nField name: "+f2.getName());
		      System.out.println("Field modifier: "+Modifier.toString(f2.getModifiers()));     
		    }  
		
		Constructor ct[] = c.getConstructors(); // get constructors of parent class too and only public one
		System.out.println("\nNo. of Constructors: "+ct.length+"\n");
		
		Constructor ct1[] = c.getDeclaredConstructors(); // get constructors of current class only with any access modifier
		System.out.println("\nNo. of Constructors in Employee: "+ct1.length+"\n");
		System.out.println("\nConstructors: ");
		for(Constructor c1 : ct1)
		{
			System.out.println(c1+" - hashcode - "+c1.hashCode()+"\n");
		}
		
		Method mt[] = c.getMethods(); /// get methods of current as well as super class
		System.out.println("\nMethods: ");
		for(Method mth : mt)
		{
			System.out.println(mth+ "- hashcode - "+mth.hashCode()+"\n");
		}
		
		Method mt1[] = c.getDeclaredMethods(); /// get methods of current class only
		System.out.println("\nMethods: ");
		for(Method mth : mt1)
		{
			System.out.println(mth+ "- hashcode - "+mth.hashCode()+"\n");
		}
		
	}

}
