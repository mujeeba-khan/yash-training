package com.yash.emsjdbc.serviceimpl;

/*
 * functionalities related to Employee services are implemented here 
 * using Java database connectivity
 */

import com.yash.emsjdbc.service.EmployeeService;
import com.yash.emsjdbc.util.GetConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.yash.emsjdbc.daoimpl.EmployeeDaoImpl;
import com.yash.emsjdbc.exception.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class EmployeeServiceImpl implements EmployeeService
{

	Logger log = Logger.getLogger(EmployeeDaoImpl.class);
	Scanner sc = new Scanner(System.in);
	
	public void searchEmployeeById() throws EmployeeByIdNotFoundException 
	{
		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("Select * from employee1 where id=?");)
			{
				System.out.println("\nEnter id: ");
				int id = sc.nextInt();
				pst.setInt(1, id);
				//int i = pst.executeUpdate();
				ResultSet rs = pst.executeQuery();
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
				log.warn("Something went wrong...");
				e.printStackTrace();
			}
		
			
	}

	public void getEmployeesByDepartment() 
	{
		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("Select * from employee1 where department=?");)
			{
				System.out.println("\nEnter department: ");
				String dept = sc.next();
				pst.setString(1, dept);
				//int i = pst.executeUpdate();
				ResultSet rs = pst.executeQuery();
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
				log.warn("Something went wrong...");
				e.printStackTrace();
			}
		
	}

	public void getAllDepartments()
	{
		try(Connection con = GetConnection.getConn();
				Statement st = con.createStatement();)
			{
				String q = "Select distinct department from employee1";
				
				ResultSet rs = st.executeQuery(q);
				log.info("\nDepartments-");
				while(rs.next())
				{
					log.info("\n"+rs.getString(1));
				}
								
			}
			catch(Exception e)
			{
				log.warn("Something went wrong...");
				e.printStackTrace();
			}
		
	}
	
	

	public void getHighestPaidEmployee()
	{
		try(Connection con = GetConnection.getConn();
				Statement st = con.createStatement();)
			{
				String q = "Select * from employee1 where salary=(Select max(salary) from employee1)";
				
				ResultSet rs = st.executeQuery(q);
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
				log.warn("Something went wrong...");
				e.printStackTrace();
			}
		
		
	}

	public void getEmployeeByNameAndSalary() throws EmployeeByNameAndSalaryNotFoundException 
	{
		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("Select * from employee1 where name=? AND salary=?");)
			{
				System.out.println("\nEnter name: ");
				String name = sc.next();
				sc.nextLine();
				System.out.println("\nEnter salary: ");
				Double sal = sc.nextDouble();
				pst.setString(1, name);
				pst.setDouble(2, sal);
				//int i = pst.executeUpdate();
				ResultSet rs = pst.executeQuery();
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
				log.warn("Something went wrong...");
				e.printStackTrace();
			}
		
	}

	public void getLimitedRecords() 
	{

		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("Select * from employee1 limit ?");)
			{
				System.out.println("\nEnter limit: ");
				int l = sc.nextInt();
				pst.setInt(1, l);
				//int i = pst.executeUpdate();
				ResultSet rs = pst.executeQuery();
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
				log.warn("Something went wrong...");
				e.printStackTrace();
			}
		
		
	}
	
	
	
	
	

}
