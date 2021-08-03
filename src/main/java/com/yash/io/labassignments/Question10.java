package com.yash.io.labassignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Question10 
{

	public static void main(String[] args) 
	{
		try 
		{
			Employee e1 = new Employee(1,"Avi",78987,"Programmer","23-7-2011");
			
			FileOutputStream fos = new FileOutputStream("E:\\Java Yash training\\Employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.flush(); // to release the data which is stored, after use
			System.out.println("Object is serialized..");

			
			FileInputStream fis = new FileInputStream("E:\\Java Yash training\\Employee.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e11 = (Employee)ois.readObject();
			System.out.println("Id: "+e11.id+"\nName: "+e11.name+"\nSalary: "+e11.salary+
			"\nDesignation: "+e11.designation+"\nDate of joining: "+e11.date_Of_Joining);

		} 
		catch (IOException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 

	}

}
