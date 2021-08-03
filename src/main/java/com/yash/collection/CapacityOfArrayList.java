package com.yash.collection;

import java.util.ArrayList;

public class CapacityOfArrayList {

	public static void main(String[] args) {

		//explicitly initial capacity changed to 20. 
		//That means the ArrayList will be able to hold 20 elements 
		//before it needs to resize the internal array.
		ArrayList<Integer> arl=new ArrayList<Integer>(20);

		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		int initial_Cap = 10;
		//by default capacity is 10
		
		
		System.out.println("When there is no element in an array list\nSize: "+marks.size());
		System.out.println("Capacity: 10");
		
		marks.add(89); // English         
		marks.add(76); // Hindi
		marks.add(76); // Physics
		marks.add(78); // Chemistry
		marks.add(92); // Maths
		
		System.out.println("After 5 elements got added in an array list\nSize: "+marks.size());
		System.out.println("Capacity: 10");
		
		marks.add(89);         
		marks.add(76); 
		marks.add(76); 
		marks.add(78); 
		marks.add(92);
		
		System.out.println("After 5 more elements, total 10 elemnents got added in an array list\nSize: "+marks.size());
		System.out.println("Capacity: 10");
		
		marks.add(90);
		//Now if one more element also got added in an array list thereby surpassing its initial capacity
		//then the capacity is calculated by using this formula- (initial cap * 3)/2 + 1
		
		int new_Capacity = (initial_Cap * 3)/2 + 1;
		initial_Cap = new_Capacity;
		
		System.out.println("When 11th element is added");
		System.out.println("Size: "+marks.size());
		System.out.println("Capacity: "+new_Capacity);
		
		//11th element is added to it, the new internal array will be created 
		//with a size of (10 * 3)/2 + 1 that is 16.
		
		marks.add(16,70);
		
		//17th element is added to it, the new internal array will be created 
		//with a size of (16 * 3)/2 + 1 that is 25.
		
		//Now if suppose we deliberately want to increase the capacity of an arraylist
		//we can do it using ensureCapacity()
		
		marks.ensureCapacity(23);
		//Now total 23 elements can be easily stored in it, beyond that again the capacity 
		//will be calculated in a similar manner. 

		
	}

}
