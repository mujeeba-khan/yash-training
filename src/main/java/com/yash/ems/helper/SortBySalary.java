package com.yash.ems.helper;

/*
 * Comapartor for sorting the records on the basis of salary
 */

import java.util.Comparator;
import com.yash.ems.model.Employee;

public class SortBySalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) 
	{
		if(e1.getSalary()==e2.getSalary())  
		return 0;  
		else if((e1.getSalary()>e2.getSalary()))  
		return 1;  
		else  
		return -1; 
	
	}
}
