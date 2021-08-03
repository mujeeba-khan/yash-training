package com.yash.abstraction;

public class Person implements AtmMachine {

	@Override
	public void withdrawMoney() {
		
		System.out.println("Withdraw money");
		
	}

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Check Balance");
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
