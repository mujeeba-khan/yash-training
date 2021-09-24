package com.yash.ems.web;

/*
 * Controller is responsible for controlling the application logic and acts as the coordinator
 * between the View and the Model.
 * 
 * EmployeeSearchByNameController is getting used to map the url for searchbyname and success jsp page
 * 
 * @author Mujeeba
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.ems.exception.EmployeeByNameNotFoundException;
import com.yash.ems.model.Employee;
import com.yash.ems.serviceimpl.EmployeeServiceImpl;

@Controller
@RequestMapping("/searchbyname")
public class EmployeeSearchByNameController
{
	EmployeeServiceImpl empser = new EmployeeServiceImpl();
	
	/*
	* This method will serve as default GET handler.
	*/
	
	@RequestMapping(method = RequestMethod.GET)
	public String searchpage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "searchbyname";
	}
	
	/*
	* This method will be called on form submission, handling POST request..
	*/
	
	@RequestMapping(method = RequestMethod.POST)
	public String searchEmp(Employee employee,BindingResult result, ModelMap model)
	{
		String ename = employee.getName();
		Employee e;
		try 
		{
			e = empser.searchEmployeeByName(ename);
			model.addAttribute("employee", e);
			model.addAttribute("success", "Record found !!!");
			return "success";
			
		} catch (EmployeeByNameNotFoundException e1) {
			
			//e1.printStackTrace();
			model.addAttribute("success", "Sorry! this employee name doesn't exist..");
			return "success";
		}
		//return null;
		
	}
}
