package com.yash.ems.serviceimpl;

import java.util.List;

/*
 * functionalities related to Employee services are implemented here 
 * using hibernate
 * 
 * @author Mujeeba
 */

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.yash.ems.configuration.HibernateConfig;
import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;


public class EmployeeServiceImpl implements EmployeeService
{

	Logger log = Logger.getLogger(EmployeeServiceImpl.class);
	private HibernateConfig hbc = new HibernateConfig();
	Employee e = null;
	
	@Override
	public Employee searchEmployeeById(int eid) throws EmployeeByIdNotFoundException
	{
		try
		{
			Session session = hbc.getSession();
			Transaction t=session.beginTransaction();
			
			e = (Employee) session.get(Employee.class, eid); 
			
			t.commit();
			
			log.info("Succesfully found..");
			
			session.close();
			return e;
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public Employee searchEmployeeByName(String ename) throws EmployeeByNameNotFoundException
	{
		try
		{
			Session session = hbc.getSession();
			Transaction t=session.beginTransaction();
			
			String hql = "FROM Employee E WHERE E.name = :empname";
			Query query1 = session.createQuery(hql);
			query1.setParameter("empname",ename);
			List<Employee> elist = query1.list();
			Employee e = elist.get(0);
			
			t.commit();
			
			log.info("Succesfully found..");
			
			session.close();
			return e;
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		
		
		return null;
		
	}
	
}
