package com.yash.ems.serviceimpl;

/*
 * functionalities related to Employee services are implemented here 
 * using Java database connectivity
 * 
 * @author Mujeeba
 */

import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;
//import com.yash.emsjdbc.daoimpl.EmployeeDaoImpl;
import com.yash.ems.util.GetConnection;

public class EmployeeServiceImpl implements EmployeeService
{

	Logger log = Logger.getLogger(EmployeeServiceImpl.class);
	
	@Override
	public Employee searchEmployeeById(int eid) throws EmployeeByIdNotFoundException
	{
		Employee e = null;
		
		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("Select * from employee where id=?");)
			{
				pst.setInt(1, eid);
				ResultSet rs = pst.executeQuery();
				
				while(rs.next())
				{
					int id = rs.getInt(1);
					
					if(id!=eid)
					{
						throw new EmployeeByIdNotFoundException("Employee Id doesn't exist");
					}
					
					String name = rs.getString(2);
					Double salary = rs.getDouble(3);
					String department = rs.getString(4);
					String designation = rs.getString(5);
					String address = rs.getString(6);
					
					e = new Employee(id,name,salary,department,designation,address);
					
				}
				
				return e;
			}
			catch(Exception e1)
			{
				log.warn("Something went wrong...");
				e1.printStackTrace();
			}
		
		return null;
		
	}

	@Override
	public Employee searchEmployeeByName(String ename) throws EmployeeByNameNotFoundException
	{

		Employee e = null;
		
		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("Select * from employee where name=?");)
			{
				pst.setString(1, ename);
				ResultSet rs = pst.executeQuery();
				
				while(rs.next())
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					
					if(!(name.equalsIgnoreCase(ename)))
					{
						throw new EmployeeByNameNotFoundException("Employee name doesn't exist");
					}
					
					Double salary = rs.getDouble(3);
					String department = rs.getString(4);
					String designation = rs.getString(5);
					String address = rs.getString(6);
					
					e = new Employee(id,name,salary,department,designation,address);
					
				}
				
				return e;
			}
			catch(Exception e1)
			{
				log.warn("Something went wrong...");
				e1.printStackTrace();
			}
		
		return null;
		
	
		
		
	}
	
}
