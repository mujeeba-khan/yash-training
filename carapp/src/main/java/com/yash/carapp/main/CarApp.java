package com.yash.carapp.main;

import com.yash.carapp.daoimpl.CarDaoImpl;

/*
 * Car main class from where the actual execution 
 * of this application will take place
 * 
 */

public class CarApp 
{

	public static void main(String[] args)
	{
		
		CarDaoImpl car = new CarDaoImpl();
		
		car.addCarDetails(); // inserting the records in car table
		
		car.getCarDetails(); // retrieving the records from car table
		
		car.updateCarDetails(); // updating the records in car table
		car.getCarDetails();
		
		car.deleteCarDetails(); // deleting the records from car table
		car.getCarDetails();
	}

}
