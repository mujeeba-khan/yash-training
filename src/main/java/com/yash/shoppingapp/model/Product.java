package com.yash.shoppingapp.model;

import java.util.Objects;

public class Product 
{
	int product_Id;
	String product_Name;
	int product_Quantity;
	double product_Price;
	
	
	public Product() {
		super();
	}


	public Product(int product_Id, String product_Name, int product_Quantity, double product_Price) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.product_Quantity = product_Quantity;
		this.product_Price = product_Price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(product_Id, product_Name, product_Price, product_Quantity);
	}

	

	public int getProduct_Id() {
		return product_Id;
	}


	public String getProduct_Name() {
		return product_Name;
	}


	public int getProduct_Quantity() {
		return product_Quantity;
	}


	public double getProduct_Price() {
		return product_Price;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return product_Id == other.product_Id && Objects.equals(product_Name, other.product_Name)
				&& Double.doubleToLongBits(product_Price) == Double.doubleToLongBits(other.product_Price)
				&& product_Quantity == other.product_Quantity;
	}


	@Override
	public String toString() {
		return "\n[Product_Id=" + product_Id + ", Product_Name=" + product_Name + ", Product_Quantity="
				+ product_Quantity + ", Product_Price=" + product_Price+"]";
	}
	
	
	
	
}
