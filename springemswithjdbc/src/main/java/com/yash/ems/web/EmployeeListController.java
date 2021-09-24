package com.yash.ems.web;

/*
 * Controller is responsible for controlling the application logic and acts as the coordinator
 * between the View and the Model.
 * 
 * EmployeeListController is getting used to map the url for empllist jsp page
 * 
 * @author Mujeeba
 */

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.model.Employee;

@Controller
@RequestMapping("/list")
public class EmployeeListController 
{
	EmployeeDaoImpl empdao = new EmployeeDaoImpl();
	
	/*
	* This method will serve as default GET handler.
	* it will return employee list
	*/
	
	@RequestMapping(method = RequestMethod.GET)
	public String getList(ModelMap model) 
	{
		List<Employee> emplist = empdao.getEmployeeList();
		model.addAttribute("emplist", emplist);
		return "empllist";
	}
	
}
