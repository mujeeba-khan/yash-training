package com.yash.abstraction;

public class Manager extends Employee
{

	@Override
	void getId() {
		int id=1;
		System.out.println(id);
	}

	@Override
	void getSal() {
		
		double salary = 34000;
		System.out.println(salary);
	}

	@Override
	void getDesg() {
		
		String designation = "Manager";
		System.out.println(designation);
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw money");
	}

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStatement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub
		
	}
	
}
