package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public class SavingsAccount extends Account
{

	double interest;
	double balance;
	public SavingsAccount(String account_Number, double interest) {
		super(account_Number);
		this.interest = interest;
	}

	public void addInterest()
	{
		double newbalance = balance+interest;
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		balance = 12345;
		System.out.println("Balance: "+balance);
		
	}
}
