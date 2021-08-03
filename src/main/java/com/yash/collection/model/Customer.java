package com.yash.collection.model;

import java.util.Objects;

public class Customer 
{
	int customer_Id;
	public String customer_Name;
	public int product_Quantity;
	
	public Customer(int id, String name, int product_Quantity) {
		super();
		this.customer_Id = id;
		this.customer_Name = name;
		this.product_Quantity = product_Quantity;
	}

	
	
	public int getCustomer_Id() {
		return customer_Id;
	}



	public String getCustomer_Name() {
		return customer_Name;
	}



	public int getProduct_Quantity() {
		return product_Quantity;
	}



	@Override
	public String toString() {
		return "\nId=" + customer_Id + "\nName=" + customer_Name + "\nProduct quantity=" + product_Quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer_Id, customer_Name, product_Quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customer_Id == other.customer_Id && Objects.equals(customer_Name, other.customer_Name)
				&& product_Quantity == other.product_Quantity;
	}
	
	
	
}
