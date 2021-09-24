package com.yash.ems.web;

/*
 * Controller is responsible for controlling the application logic and acts as the coordinator
 * between the View and the Model.
 * 
 * EmployeeSearchByIdController is getting used to map the url for searchbyid and success jsp page
 * 
 * @author Mujeeba
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.yash.ems.serviceimpl.EmployeeServiceImpl;
import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.model.Employee;

@Controller
@RequestMapping("/searchbyid")
public class EmployeeSearchByIdController 
{
	EmployeeServiceImpl empser = new EmployeeServiceImpl();
	
	/*
	* This method will serve as default GET handler
	*/
	
	@RequestMapping(method = RequestMethod.GET)
	public String searchpage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "searchbyid";
	}
	
	/*
	* This method will be called on form submission, handling POST request It
	* also validates the user input
	*/
	
	@RequestMapping(method = RequestMethod.POST)
	public String searchEmp(Employee employee,BindingResult result, ModelMap model)
	{
		int empid = (int) employee.getId();
		Employee e;
		try
		{
			e = empser.searchEmployeeById(empid);
			model.addAttribute("employee", e);
			model.addAttribute("success", "Record found !!!");
			return "success";
			
		} catch (EmployeeByIdNotFoundException e1) {
			//e1.printStackTrace();
			model.addAttribute("success", "Sorry! this employee id doesn't exist..");
			return "success";
		}
		//return null;
		
	}
}
