package com.yash.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		 LinkedList<Integer> marks=new LinkedList<Integer>();  
		  marks.add(98);  
		  marks.add(78);  
		  marks.add(67);  
		  marks.add(65);
		  
		  marks.addFirst(12);
		  marks.addLast(23);

		  System.out.println(marks);
		  
		  System.out.println("90 is present: "+marks.contains(90));
		  
		  System.out.println("First element: "+marks.getFirst());
		  
		  System.out.println("Last element: "+marks.getLast());
		  
		  System.out.println("Removes and return the first element: "+marks.removeFirst());
		  
	}

}
