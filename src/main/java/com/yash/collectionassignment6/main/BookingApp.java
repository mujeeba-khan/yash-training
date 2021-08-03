package com.yash.collectionassignment6.main;

import java.util.Collections;
import java.util.LinkedList;
import com.yash.collectionassignment6.helper.SortByBlock;
import com.yash.collectionassignment6.model.*;

public class BookingApp {

	public static void main(String[] args) {


		LinkedList<Ticket> tic = new LinkedList<Ticket>();
		tic.add(new Ticket(2,"Box","Dangal",1004)) ;
		tic.add(new Ticket(2,"A1","Pink",1233)); 
		tic.add(new Ticket(1,"C2","Dangal",500)) ;
		tic.add(new Ticket(7,"E1","Dangal",6234)) ;
		tic.add(new Ticket(3,"B4","Neerja",1323)) ;
		tic.add(new Ticket(1,"B2","Dangal",450));
		
		LinkedList<Customer> cus = new LinkedList<Customer>();
		cus.add(new Customer("Abhay","72177","Indore"));
		cus.add(new Customer("Aadil","721771223","Indore"));
		cus.add(new Customer("Bilal","81901","Mumbai"));
		cus.add(new Customer("Danish","2033299","Pune"));
		
		for(Ticket t : tic)
		{
			System.out.println(t);
		}
		
		System.out.println("First booking of ticket: "+tic.getFirst()+"\n");
		
		System.out.println("Last booking of ticket: "+tic.getLast()+"\n");
		
		tic.remove();
		System.out.println("First ticket got removed. Remaining tickets are - ");
		for(Ticket t : tic)
		{
			System.out.println(t);
		}
		
		System.out.println("Ticket booked at 5th position: "+tic.get(4));
		
		Ticket t7 = new Ticket(2,"D6","M2",830);
		Ticket t8 = new Ticket(2,"C2","M1",630);
		tic.addFirst(t7);
		tic.addLast(t8);
		System.out.println("Adding tickets from both sides \n"+tic);
		
		System.out.println("Sorting by block\n");
		Collections.sort(tic, new SortByBlock());
		
		System.out.println("First five sorted booked tickets: ");
		Ticket t[] = tic.toArray(new Ticket[tic.size()]);
		for(int i=0;i<5;i++)
		{
			System.out.println(t[i]);
		}
		
		System.out.println("Size of booked tickets: "+tic.size());
		
		Customer cust[] = cus.toArray(new Customer[cus.size()]);
		System.out.println("Customer names starting with A: \n");
		for(int i=0;i<cust.length;i++)
		{
			if(cust[i].getName().startsWith("A"))
			{
				String name = cust[i].getName();
				System.out.println(name);
			}
		}
		

	}

}
