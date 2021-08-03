package com.yash.collectionassignment2.model;

import java.util.Objects;

public class Product 
{
	int product_Id;
	String product_Name;
	double product_Price;
	
	
	public Product() {
		super();
	}

	
	public Product(int product_Id, String product_Name, double product_Price) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.product_Price = product_Price;
	}

	

	public int getProduct_Id() {
		return product_Id;
	}


	public String getProduct_Name() {
		return product_Name;
	}


	public double getProduct_Price() {
		return product_Price;
	}


	@Override
	public String toString() {
		return "\nProduct Id=" + product_Id + "\n Product Name=" + product_Name + ", Product Price="
				+ product_Price ;
	}


	@Override
	public int hashCode() {
		return Objects.hash(product_Id, product_Name, product_Price);
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
				&& Objects.equals(product_Price, other.product_Price);
	}
	
	
	
	
}
