package com.yash.collectionassignment3.main;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.yash.collectionassignment3.model.Patient;

public class PatientApp 
{

	public static void main(String[] args) {

		LinkedHashSet<Patient> pat = new LinkedHashSet<Patient>();
		Patient first=null, last=null;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<7;i++)
		{
			System.out.println("Enter details: ");
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Contact: ");
			String contact = sc.next();
			System.out.println("Blood Group: ");
			String bloodGroup = sc.next();
			
			pat.add(new Patient(contact,name,bloodGroup));
		}
		
		System.out.println("List of patients: ");
		Iterator<Patient> val = pat.iterator();
		while(val.hasNext())
		{
			System.out.println(val.next());
		}
		
		for(Patient p : pat)
		{
			first = p;
			break;
		}
		
		System.out.println("\nRecords of first patient: "+first);
		
		for(Patient p : pat)
		{
			last = p;
		}
		
		System.out.println("\nRecords of last patient: "+last);
		
		System.out.println("\nRecords of first 5 patients are: ");
		Patient ptarr[] = pat.toArray(new Patient[pat.size()]);
		for(int i=0;i<5;i++)
		{
			System.out.println(ptarr[i]);
		}
		
		
		
		
	}

}
