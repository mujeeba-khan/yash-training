package com.yash.carapp.model;

/*
 * Engine POJO class 
 * which will have a has-A relationship with Car class
 * 
 */

public class Engine 
{
	private int modelYear;
	private String manufacturerCompany;
	
	public Engine() {
		super();
	}

	public Engine(int modelYear, String manufacturerCompany) {
		super();
		this.modelYear = modelYear;
		this.manufacturerCompany = manufacturerCompany;
	}

	public int getModelYear() {
		return modelYear;
	}

	public String getManufacturerCompany() {
		return manufacturerCompany;
	}
	
	
}
