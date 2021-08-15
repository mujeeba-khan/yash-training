package com.yash.carapp.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import com.yash.carapp.dao.CarDao;
import com.yash.carapp.exception.CarTypeMismatchedException;
import com.yash.carapp.model.Car;
import com.yash.carapp.util.CarType;

import org.apache.log4j.Logger;

/*
 * Car DAO implementation class with 
 * all the functionalities worked upon Car entity 
 */

public class CarDaoImpl implements CarDao
{
	Logger log = Logger.getLogger(CarDaoImpl.class);
	Scanner sc = new Scanner(System.in);
	
	//displaying the information of car details
	
	public void getCarDetails() 
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
				Statement st = con.createStatement();)
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			//log.info("Database connected..");
			
			log.info("\nCar details: \n");
			String q1="Select car.registrationNumber, car.ownerName, car.type, car.engine "
					+ "engine.modelYear, engine.manufacturerCompany from "
					+ "car inner join engine on car.engine=engine.id";
			
			ResultSet rs = st.executeQuery(q1);
			while(rs.next())
			{
				log.info("\nRegistration number: "+rs.getInt(1)
				+"\nOwner name: "+rs.getString(2)
				+"\nCar type: "+rs.getString(3)
				+"\nEngine: "+rs.getString(4)
				+"\nModel year: "+rs.getInt(5)
				+"\nManufacturer company: "+rs.getString(6));
			}
			
			
		}
		catch(Exception e)
		{
			log.warn("Something went wrong...");
			e.printStackTrace();
		}
	}

	//adding car details
	
	public void addCarDetails() 
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
				Statement st = con.createStatement();)
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			log.info("Database connected..");
			
			/*
			for(int i=0;i<4;i++)
			{ 
				System.out.println("Engine details: ");
				System.out.println("Engine id: ");
				int eid = sc.nextInt();
				System.out.println("Model year: ");
				int my = sc.nextInt();
				System.out.println("Manufacturer company: ");
				String mc = sc.next();
				
				PreparedStatement st2 = con.prepareStatement("Insert into engine values(?,?,?)");
				st2.setInt(1, eid);
				st2.setInt(2, my);
				st2.setString(3, mc);
				st2.executeUpdate();
				
				System.out.println("Enter car details: ");
				System.out.println("Registration number: ");
				int rn = sc.nextInt();
				sc.nextLine();
				System.out.println("Owner name: ");
				String on = sc.nextLine();
				System.out.println("Car type: ");
				String type = sc.next();
				
				carTypeMismatch(type);
				
				PreparedStatement st1 = con.prepareStatement("Insert into car values(?,?,?,?)");
				st1.setInt(1, rn);
				st1.setString(2, on);
				st1.setString(3, type);
				st1.setInt(4,eid);
				st1.executeUpdate();
				
				log.info("\n Records inserted\n");

			}
			*/
			
			int j = st.executeUpdate("Insert into engine values"
					+ "(89,2016,'Abc'),"
					+ "(72,2018,'Def'),"
					+ "(34,2009,'Klm'),"
					+ "(67,2014,'Xyz'),"
					+ "(100,2012,'Abc')");
			
			int i = st.executeUpdate("Insert into car values"
					+ "(5642,'John','Maruti',72),"
					+ "(6754,'Jenny','Maruti',34),"
					+ "(7654,'Ken','Hyundai',89),"
					+ "(8762,'William','Maruti',100),"
					+ "(4321,'Bob','Hyundai',67)");
					
			log.info("\n"+i+" Records inserted\n");
			
		}
		catch(Exception e)
		{
			log.warn("\nSomething went wrong...");
			e.printStackTrace();
		}
		
	}

	//updating car details
	
	public void updateCarDetails()
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
				Statement st = con.createStatement();)
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			//log.info("Database connected..");
			
			int i = st.executeUpdate("Update car set type='Hyundai' where registrationNumber=8762");
			log.info("\n"+i+" Record updated\n");
			
		}
		catch(Exception e)
		{
			log.warn("Something went wrong...");
			e.printStackTrace();
		}
	}

	//deleting car details
	
	public void deleteCarDetails()
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
				Statement st = con.createStatement();)
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			//log.info("Database connected..");
			
			int i = st.executeUpdate("Delete from car where registrationNumber=4321");
			log.info("\n"+i+" Record deleted\n");
			
		}
		catch(Exception e)
		{
			log.warn("Something went wrong...");
			e.printStackTrace();
		}
		
	}
	
	public static void carTypeMismatch(String type) throws CarTypeMismatchedException
	{
		if(!(type.equalsIgnoreCase("Maruti") || type.equalsIgnoreCase("Hyundai")))
		{
			throw new CarTypeMismatchedException("Car type doesn't match..It should be either Maruti or Hyundai");
		}
	}


}
