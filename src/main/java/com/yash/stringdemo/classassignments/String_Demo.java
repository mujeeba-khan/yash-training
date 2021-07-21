package com.yash.stringdemo.classassignments;

public class String_Demo {

	public static void main(String[] args) {
		
		String firstName = "Mujeeba";
		String chars = "!,@,#,$,%,*,(,)";
		String lastName = new String("   Khan");

		System.out.println("Length: "+firstName.length());
		System.out.println("Upper case: "+firstName.toUpperCase());
		System.out.println("Lower case: "+firstName.toLowerCase());
		System.out.println("Char at 3: "+firstName.charAt(3));
		System.out.println("Replace: "+firstName.replace("jee","jii"));
		System.out.println("Trimm: "+lastName.trim());
		System.out.println("Index of j: "+firstName.indexOf('j'));
		System.out.println("Last index of e: "+firstName.lastIndexOf('e'));
		System.out.println("Substring: "+firstName.substring(2,6));
		
		System.out.println("Splitting: ");
		String values[] = chars.split(",");
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i]);
		}
	}

}
