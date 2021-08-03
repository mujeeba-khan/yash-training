package com.yash.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		
		// list of marks scored in 5 different subjects of a particular student, 
		// where he/she can have same marks in different subjects too.
		
		int total=0;
		
		ArrayList<Integer> marks=new ArrayList<Integer>(20);
		
		marks.add(89); // English         inserting an element into a list 
		marks.add(76); // Hindi
		marks.add(76); // Physics
		marks.add(78); // Chemistry
		marks.add(92); // Maths
		
		// same marks in Physics and Hindi, List can store duplicate elements 
		
		System.out.println("Marks scored are: ");
		for(int m : marks)
		{
			System.out.println(m);
			total+=m;
		}
		System.out.println("Total marks: "+total);
		System.out.println("Percentage: "+((float)total/5)+"%");
		
		
		
		
		marks.add(1,90); // inserting new element at position 2 i.e. index 1
		
		System.out.println("list contains 92 : "+marks.contains(92));
		
		System.out.println("Element at position 3: "+marks.get(2));
		
		System.out.println("Index of 76: "+marks.indexOf(76));
		
		System.out.println("list is empty: "+marks.isEmpty());
		
		System.out.println("New Marks scored are: "+marks.remove(marks));
		
		marks.remove(3);
		
		System.out.println("New Marks scored are: ");
		for(int m : marks)
		{
			System.out.println(m);
		}
		
		System.out.println("No. of elements are: "+marks.size());
		
		List<Integer> sub = marks.subList(1, 4);
		System.out.println("Marks of 3 subjects are: ");
		
		for(int m : sub)
		{
			System.out.println(m);
		}
		
		marks.clear();
		System.out.println("Removed all the elements fom the list");
		for(int m : marks)
		{
			System.out.println(m);
		}
		
	}

}
