package com.yash.ems.util;

/*
 * GetConnection class is used to create connection with mysql database and
 * it returns the instance of Connection
 * Here empldb is the database which contains employee1 table
 * 
 * @author Mujeeba
 */

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class GetConnection 
{
	public static Connection getConn()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/empldb";
			Connection con = (Connection) DriverManager.getConnection(url,"root","root");
			return con;
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		
		return null;
		
	}
	
}