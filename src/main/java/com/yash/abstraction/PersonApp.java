package com.yash.abstraction;

public class PersonApp {
	
	public static void main(String[] args)
	{
		Person p = new Person();
		p.checkBalance();
		p.withdrawMoney();
		System.out.println(p.city);
		//AtmMachine.city="Pune"; // as by default its final its value cant be changed
	}

}
