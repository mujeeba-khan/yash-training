package com.yash.collectionassignment4.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.yash.collectionassignment4.model.Employee;



public class EmployeeApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Employee> hs = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee(12,"E1",62389,"Desg1","D1");
		Employee e2 = new Employee(43,"E2",12324,"Desg2","D2");
		Employee e3 = new Employee(78,"E3",34325,"Desg3","D3");
		Employee e4 = new Employee(290,"E4",23323,"Desg4","D4");
		Employee e5 = new Employee(121,"E5",232355,"Desg5","D5");
		Employee e6 = new Employee(53,"E6",242555,"Desg6","D6");
		
		hs.put(e1.getId(), e1);
		hs.put(e2.getId(), e2);
		hs.put(e3.getId(), e3);
		hs.put(e4.getId(), e4);
		hs.put(e5.getId(), e5);
		hs.put(e6.getId(), e6);
		
		if(!hs.isEmpty()) {
	         Iterator it = hs.entrySet().iterator();
	         while(it.hasNext()) {
	            Map.Entry obj = (Entry)it.next();
	            System.out.println(obj.getValue());
	         }
	      }

		System.out.println("No. of records: "+hs.size());
		
		System.out.println("Testing for the specified key: "+hs.getOrDefault(e3.getId(), e6));
		
		System.out.println("Enter name for searching: ");
		String name = sc.next();
		
		System.out.println("Employee by key: "+hs.get(290));
		
		int key = e4.getId();
		Employee e = hs.get(key);
		System.out.println("Employee by value: "+e);
		
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("E:\\Java Yash training\\data.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Collection<Employee> ce = hs.values();
			Employee earr[] = ce.toArray(new Employee[ce.size()]); 
			for(int i=0;i<earr.length;i++)
			{
				oos.writeObject(earr[i]);
			}
			
			oos.flush(); // to release the data which is stored, after use
			System.out.println("Object is serialized..");
			
			FileInputStream fis = new FileInputStream("E:\\Java Yash training\\data.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			for(int i=0;i<earr.length;i++)
			{
				Employee ep = (Employee)ois.readObject();
				System.out.println("Id: "+ep.getId()+"\nName: "+ep.getName()
				+"\nSalary: "+ep.getSalary()+"\nDesignation: "+ep.getDesignation()
				+"\nDepartment: "+ep.getDepartment());
			}
			
			
		} catch (IOException | ClassNotFoundException exc) {
			exc.printStackTrace();
		} 


		
		
		
		
		
		
		
		
		
		
	}

}
