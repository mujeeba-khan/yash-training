package com.yash.dealerapp.model;

/*
 * Dealer POJO class with instance variables
 * getters, constructors, toString()
 * in order to create the Dealer object
 */

public class Dealer 
{
	private int registrationNumber;
	private String shopName;
	private String ownerName;
	private Product product; //Product class : Has-A relationship
	
	public Dealer() {
		super();
	}
	
	public Dealer(int registrationNumber, String shopName, String ownerName, Product product) {
		super();
		this.registrationNumber = registrationNumber;
		this.shopName = shopName;
		this.ownerName = ownerName;
		this.product = product;
	}

	
	
	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public String getShopName() {
		return shopName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public Product getProduct() {
		return product;
	}

	@Override
	public String toString() {
		return "Dealer [registrationNumber=" + registrationNumber + ", shopName=" + shopName + ", ownerName="
				+ ownerName + ", product=" + product + "]";
	}
	
	
}
