package com.yash.dealerapp.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import org.apache.log4j.Logger;
import com.yash.dealerapp.dao.DealerDao;


/*
 * Dealer DAO implementation class with 
 * all the functionalities worked upon Dealer entity 
 */
public class DealerDaoImpl implements DealerDao
{

	Logger log = Logger.getLogger(DealerDaoImpl.class);
	Scanner sc = new Scanner(System.in);
	
	//displaying the information of dealer details
	
	public void getDealerDetails()
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
				Statement st = con.createStatement();)
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			//log.info("Database connected..");
			
			log.info("\nDealer details: \n");
			String q1 = "Select dealer.registrationNumber, dealer.shopName, dealer.ownerName, "
					+ "product.name, product.description from "
					+ "dealer inner join product on dealer.product=product.id";
			ResultSet rs = st.executeQuery(q1);
			while(rs.next())
			{
				log.info("\nRegistration number: "+rs.getInt(1)
				+"\nShop name: "+rs.getString(2)
				+"\nOwner name: "+rs.getString(3)
				+"\nProduct name: "+rs.getString(4)
				+"\nProduct description: "+rs.getString(5));
			}
			
			
		}
		catch(Exception e)
		{
			log.warn("Something went wrong...");
			e.printStackTrace();
		}
		
	}

	//inserting dealer details
	
	public void addDealerDetails() 
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
				Statement st = con.createStatement();)
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			log.info("Database connected..");
			
			/*
			for(int i=0;i<4;i++)
			{ 
				log.info("Product details: ");
				System.out.println("Id: ");
				int pid = sc.nextInt();
				System.out.println("Name: ");
				String pname  = sc.next();
				System.out.println("Description: ");
				String pdescp  = sc.nextLine();
				
				PreparedStatement st2 = con.prepareStatement("Insert into product values(?,?,?)");
				st2.setInt(1, pid);
				st2.setString(2, pname);
				st2.setString(3, pdescp);
				st2.executeUpdate();
				
				System.out.println("Enter dealer details: ");
				System.out.println("Registration number: ");
				int rn = sc.nextInt();
				sc.nextLine();
				System.out.println("Shop name: ");
				String sn = sc.nextLine();
				System.out.println("Owner name: ");
				String on = sc.nextLine();
				System.out.println("Product id: ");
				int proid = sc.nextInt();
				
				
				PreparedStatement st1 = con.prepareStatement("Insert into dealer values(?,?,?,?)");
				st1.setInt(1, rn);
				st1.setString(2, sn);
				st1.setString(3, on);
				st1.setInt(4, proid);
				st1.executeUpdate();
				
			}
			
			log.info("\n Records inserted\n");
			
			
			*/
			
			int j = st.executeUpdate("Insert into product values"
					+ "(12,'Mobile','Black'),"
					+ "(87,'Laptop','Lenovo'),"
					+ "(32,'Camera','DSLR'),"
					+ "(20,'Printer','Epson')");
			
			int i = st.executeUpdate("Insert into dealer values"
					+ "(5642,'ABC store','ABC',12),"
					+ "(6754,'XYZ enterprises','XYZ',32),"
					+ "(7654,'KLM hub','KM',20),"
					+ "(8762,'GHI store','GK',87)");
					
			log.info("\n"+i+" Records inserted\n");
			
		}
		catch(Exception e)
		{
			log.warn("\nSomething went wrong...");
			e.printStackTrace();
		}
			
	}
	
	//updating the information of dealer 

	public void updateDealerDetails()
	{
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
				Statement st = con.createStatement();)
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			//log.info("Database connected..");
			
			
			int i = st.executeUpdate("Update dealer set shopName='POT' where registrationNumber=8762");
			log.info("\n"+i+" Record updated\n");
			
		}
		catch(Exception e)
		{
			log.warn("Something went wrong...");
			e.printStackTrace();
		}
		
	}
	
	//deleting the information of dealer 

	public void deleteDealerDetails()
	{

		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
				Statement st = con.createStatement();)
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			//log.info("Database connected..");
			
			int i = st.executeUpdate("Delete from dealer where registrationNumber=4321");
			log.info("\n"+i+" Record deleted\n");
			
		}
		catch(Exception e)
		{
			log.warn("Something went wrong...");
			e.printStackTrace();
		}
		
		
	}
	
}
