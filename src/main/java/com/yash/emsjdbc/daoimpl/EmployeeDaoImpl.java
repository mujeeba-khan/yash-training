package com.yash.emsjdbc.daoimpl;

/*
 * functionalities related to Employee dao are implemented here 
 * using Java database connectivity
 */

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.yash.emsjdbc.dao.EmployeeDao;
import com.yash.emsjdbc.exception.EmployeeByIdNotFoundException;
import com.yash.emsjdbc.exception.InvalidDesignationException;
import com.yash.emsjdbc.util.GetConnection;

public class EmployeeDaoImpl implements EmployeeDao
{

	Logger log = Logger.getLogger(EmployeeDaoImpl.class);
	Scanner sc = new Scanner(System.in);
	
	public void getEmployeeList() 
	{
		try(Connection con = GetConnection.getConn();
				Statement st = con.createStatement();)
		{
			
			log.info("\nEmployee details: \n");
			
			String q1="Select * from employee1";
			
			ResultSet rs = st.executeQuery(q1);
			while(rs.next())
			{
				log.info("\nEmpoyee id: "+rs.getInt(1)
				+"\nName: "+rs.getString(2)
				+"\nSalary: "+rs.getDouble(3)
				+"\nDesignation: "+rs.getString(4)
				+"\nDepartment: "+rs.getString(5)
				+"\nAddress: "+rs.getString(6));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public void addEmployee() 
	{
		try(Connection con = GetConnection.getConn();
			PreparedStatement pst = (PreparedStatement) con.prepareStatement
			("Insert into employee1(name,salary,designation,department,address) values(?,?,?,?,?)");) 
		{
			System.out.println("Enter the details: ");
		
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			System.out.println("Designation: ");
			String desig = sc.next();
			invalidDesignation(desig);
			
			System.out.println("Department: ");
			String dept = sc.next();
			
			System.out.println("Address: ");
			String address = sc.next();
			
			pst.setString(1, name);
			pst.setDouble(2, salary);
			pst.setString(3, desig);
			pst.setString(4, dept);
			pst.setString(5, address);
			pst.executeUpdate();
			
			log.info("\nRecord added successfully..");
			
		}catch(Exception e)
		{
			log.warn("Something went wrong...");
			e.printStackTrace();
		}
	
	}

	public void removeEmployee() 
	{
		try(Connection con = GetConnection.getConn();
			PreparedStatement pst = (PreparedStatement) con.prepareStatement
			("Delete from employee1 where id=?");)
		{
			System.out.println("\nEnter id: ");
			int id = sc.nextInt();
			pst.setInt(1, id);
			int i = pst.executeUpdate();
			log.info("\n"+i+" Record deleted\n");
			
		}
		catch(Exception e)
		{
			log.warn("Something went wrong...");
			e.printStackTrace();
		}
		
		
	}

	public void updateEmployee() 
	{
		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("Update employee1 set name=?,salary=?,designation=?,department=?,address=? where id=?");) 
			{
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				
				System.out.println("Update the details: ");
			
				System.out.println("Name: ");
				String name = sc.next();
				
				System.out.println("Salary: ");
				Double salary = sc.nextDouble();
				
				System.out.println("Designation: ");
				String desig = sc.next();
				invalidDesignation(desig);
				
				System.out.println("Department: ");
				String dept = sc.next();
				
				System.out.println("Address: ");
				String address = sc.next();
				
				pst.setString(1, name);
				pst.setDouble(2, salary);
				pst.setString(3, desig);
				pst.setString(4, dept);
				pst.setString(5, address);
				pst.setInt(6, id);
				pst.executeUpdate();
				
				log.info("\nRecord updated successfully..");
				
				
			}catch(Exception e)
			{
				log.warn("Something went wrong...");
				e.printStackTrace();
			}
		
		
	}
	
	public static void invalidDesignation(String designation) throws InvalidDesignationException
	{
		Pattern p = Pattern.compile("^(DSG#)[0-9]{2}$");
		Matcher m = p.matcher(designation);
		boolean flag = m.matches();
		if(!flag)
		{
			throw new InvalidDesignationException("Invalid designation...follow the pattern\n"
					+"eg: DSG#08");
		}
	}

}
