package com.yash.oopsconceptdemo.labassignments;

public class CarShop {
	
	int speed;
	String car_Owner;
	String car_Type;
	
	static int cars_sold=0;
	
	{
		cars_sold += 1;
	}
	
	public CarShop(int speed, String car_Owner, String car_Type) {
		super();
		this.speed = speed;
		this.car_Owner = car_Owner;
		this.car_Type = car_Type;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCar_Owner() {
		return car_Owner;
	}

	public void setCar_Owner(String car_Owner) {
		this.car_Owner = car_Owner;
	}

	public String getCar_Type() {
		return car_Type;
	}

	public void setCar_Type(String car_Type) {
		this.car_Type = car_Type;
	}
	
	public String toString()
	{
		return "Car speed: "+speed+" Car owner: "+car_Owner+" Car Type: "+car_Type;
	}

	public static void main(String[] args) {

		CarShop cs = new CarShop(123,"Abc","SUV");
		CarShop cs1 = new CarShop(3456,"Perg","Sudan");
		CarShop cs2 = new CarShop(8765,"Lege","Vintage");
		CarShop cs3 = new CarShop(923,"Drg","Racing");
		
		System.out.println(cs+"\n"+cs1+"\n"+cs2+"\n"+cs3);
		System.out.println("Total no. of cars sold: "+cars_sold);
	}

}
