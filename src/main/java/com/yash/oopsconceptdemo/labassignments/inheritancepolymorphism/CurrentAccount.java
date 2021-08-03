package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public class CurrentAccount extends Account
{

	double overdraft_limit;
	double balance;
	
	public CurrentAccount(String account_Number, double overdraft_limit) {
		super(account_Number);
		this.overdraft_limit = overdraft_limit;
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
		
		balance = 33432;
		System.out.println("Balance: "+balance);
		
	}
	
	
}
