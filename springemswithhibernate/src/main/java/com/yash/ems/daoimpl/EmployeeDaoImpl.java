package com.yash.ems.daoimpl;

/*
 * functionalities related to Employee CRUD are implemented here 
 * using Java database connectivity
 * 
 * @author Mujeeba
 */

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import com.yash.ems.configuration.HibernateConfig;
import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.model.Employee;
import com.yash.ems.daoimpl.EmployeeDaoImpl;

public class EmployeeDaoImpl implements EmployeeDao
{
	Logger log = Logger.getLogger(EmployeeDaoImpl.class);
	
	private HibernateConfig hbc = new HibernateConfig();

	@Override
	public boolean saveEmployee(Employee employee)
	{
		try
		{
			Session session = hbc.getSession();
			Transaction t=session.beginTransaction();
			session.save(employee);
			t.commit();
			
			log.info("Succesfully saved..");
			
			session.close();
			return true;
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Employee> getEmployeeList() 
	{
		
		Session session = hbc.getSession();
		Transaction t=session.beginTransaction();
		Query query1 = session.createQuery("FROM Employee");
		List<Employee> elist = query1.list();	
		t.commit();
		
		return elist;
		
	}

	@Override
	public void updateEmployee(Employee employee) 
	{
		try
		{
			Session session = hbc.getSession();
			Transaction t=session.beginTransaction();
			session.update(employee);
			t.commit();
			
			log.info("Succesfully updated..");
			
			session.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();

		}
	}

	@Override
	public void deleteEmployee(Employee employee) {
		try
		{
			Session session = hbc.getSession();
			Transaction t=session.beginTransaction();
			session.delete(employee);
			t.commit();
			
			log.info("Succesfully deleted..");
			
			session.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();

		}
		
	}

	

}
