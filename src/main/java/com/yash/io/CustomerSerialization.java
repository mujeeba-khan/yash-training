package com.yash.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomerSerialization {

	public static void main(String[] args) {

		Customer c = new Customer(1,"Aarti");
		try {
			FileOutputStream fos = new FileOutputStream("E:\\Java Yash training\\Customer.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.flush(); // to release the data which is stored, after use
			System.out.println("Object is serialized..");
			
			FileInputStream fis = new FileInputStream("E:\\Java Yash training\\Customer.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Customer c1 = (Customer)ois.readObject();
			System.out.println("Id: "+c1.id+"\nName: "+c1.name);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 

	}

}
