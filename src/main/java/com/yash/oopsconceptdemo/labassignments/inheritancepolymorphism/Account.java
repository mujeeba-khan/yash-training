package com.yash.oopsconceptdemo.labassignments.inheritancepolymorphism;

public abstract class Account {
	
	String account_Number;
	
	public Account(String account_Number)
	{
		super();
		this.account_Number = account_Number;
	}
	
	public abstract void withdrawMoney();
	public abstract void depositMoney();
	public abstract void checkBalance();
	
}
