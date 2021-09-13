package com.yash.springwithannot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product
{
	@Value("Mobile")
    private String productName;
	
	@Value("black")
    private String color;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", color=" + color + "]";
	}
	
    
}
