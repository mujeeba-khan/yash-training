package com.yash.carapp.model;

import com.yash.carapp.util.CarType;

/*
 * Car POJO class with instance variables
 * getters, constructors, toString()
 * in order to create the Car object
 */

public class Car
{
	private int registrationNumber;
	private String ownerName;
	private String type; //enum
	private Engine engine; //Engine class : Has-A relationship
	
	public Car() {
		super();
	}

	public Car(int registrationNumber, String ownerName, String type, Engine engine) {
		super();
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.type = type;
		this.engine = engine;
	}
	
	

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getType() {
		return type;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car [registrationNumber=" + registrationNumber + ", ownerName=" + ownerName + ", type=" + type
				+ ", engine=" + engine + "]";
	}
	
	
}
