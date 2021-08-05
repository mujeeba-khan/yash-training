package com.yash.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StudentStream {

	public static void main(String[] args) 
	{
		
		ArrayList<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student(12,"John","V","10-03-2018","13-05-2007"));
		slist.add(new Student(87,"Bob","VI","10-03-2018","21-10-2006"));
		slist.add(new Student(13,"Dan","IV","10-03-2017","03-05-2008"));
		slist.add(new Student(44,"Bill","V","10-03-2018","13-08-2007"));
		slist.add(new Student(21,"Sam","VII","10-03-2018","13-05-2007"));
		
		//to fetch the names starting with B in sorted order
		 slist.stream()
		.filter(s->s.name.startsWith("B"))
		.map(s->s.name)
		.sorted()
		.forEach(System.out::println);
		
		//fetching the first record 
		slist.stream().findFirst().ifPresent(System.out::println);
		
		//getting the student with highest id
		slist.stream()
		.max((s1,s2)-> s1.id > s2.id ? 1 : -1)
		.ifPresent(System.out::println);

		//getting distinct records
			slist.stream().distinct()
				.forEach(System.out::println);
		
		slist.stream()
		.filter(s->(LocalDate.parse(s.admissionDate).getYear())==2018)
		.forEach(System.out::println);
		
	}

}
