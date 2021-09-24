package com.yash.ems.web;

/*
 * Controller is responsible for controlling the application logic and acts as the coordinator
 * between the View and the Model.
 * 
 * EmployeeController is getting used to map the url for all the functionalities related to employee
 * to their related jsp pages.
 * 
 * @author Mujeeba
 */


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;
import com.yash.ems.model.Employee;
import com.yash.ems.serviceimpl.EmployeeServiceImpl;

@Controller
@RequestMapping("/web")
public class EmployeeController 
{
	EmployeeDaoImpl empdao = new EmployeeDaoImpl();
	EmployeeServiceImpl empser = new EmployeeServiceImpl();
	
   /*It displays a form to input data, here "employee" is a reserved request attribute  
    *which is used to display object data into form  
    */    
	
   @RequestMapping("/save")    
   public String showform(ModelMap model)
   {    
       model.addAttribute("employee", new Employee());  
       return "enroll";   
   }    
   
   /*It saves object into database. The @ModelAttribute puts request data  
    *  into model object. You need to mention RequestMethod.POST method   
    *  because default request is GET*/ 
   
   @RequestMapping(value="/save",method = RequestMethod.POST)    
   public String save(@ModelAttribute("employee") Employee employee, ModelMap model)
   {    
       empdao.saveEmployee(employee);   
       return "redirect:/web/empllist";
          
   } 
   
   /* It provides list of employees in model object */  
   
   @RequestMapping("/empllist")    
   public String viewEmp(ModelMap model)
   {    
       List<Employee> list=empdao.getEmployeeList();    
       model.addAttribute("emplist",list);  
       return "empllist";    
   }  
   
   /* It updates model object. */  
   
   @RequestMapping(value="/update", method = RequestMethod.GET)
	public String updatePage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "updateform";
	}
   
   @RequestMapping(value="/update", method = RequestMethod.POST)    
   public String update(Employee employee, ModelMap model)
   {    
	   empdao.updateEmployee(employee);
	   return "redirect:/web/empllist";
   }  
   
   /* It deletes record for the given employee object in URL and redirects to /empllist */
   
   
    @RequestMapping(value="/delete", method = RequestMethod.GET)
	public String deletepage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "delete";
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public String deleteEmp(Employee employee,BindingResult result, ModelMap model)
	{
		empdao.deleteEmployee(employee); 
		return "redirect:/web/empllist";
		
	}
   
   /* It searches record for the given id or for given name in URL and redirects to /search */
   
   @RequestMapping(value="/search", method = RequestMethod.GET)
	public String searchpage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "search";
	}
   
   /* It searches record for the given id in URL and redirects to /success */
   
   @RequestMapping(value="/searchbyid",method=RequestMethod.POST)    
   public String serachById(Employee employee, ModelMap model) throws EmployeeByIdNotFoundException
   {    
       Employee employee1 = empser.searchEmployeeById(employee.getId());    
       model.addAttribute("employee",employee1);
       model.addAttribute("success", "Record found !!!");
       return "success";    
   } 
   
   /* It displays object data into form for the given name.   
    * 
    */
   
   @RequestMapping(value="/searchbyname",method=RequestMethod.POST)    
   public String serachByName(Employee employee, ModelMap model) throws EmployeeByNameNotFoundException
   {    
       Employee employee1 = empser.searchEmployeeByName(employee.getName());    
       model.addAttribute("employee",employee1);
       model.addAttribute("success", "Record found !!!");
       return "success";    
   } 
    
   /*
	* Method used to populate the Department list in view. Note that here you can
	* call external systems to provide real data.
	*/
	
	@ModelAttribute("department")
	public List<String> initializeDepartments()
	{
		List<String> department = new ArrayList<String>();
		department.add("IT");
		department.add("Testing");
		department.add("Research");
		department.add("HR");
		department.add("Finance");
		return department;
	}
	
	/*
	* Method used to populate the country list in view. Note that here you can
	* call external systems to provide real data.
	*/
	
	@ModelAttribute("countries")
	public List<String> initializeCountries()
	{
		List<String> countries = new ArrayList<String>();
		countries.add("INDIA");
		countries.add("USA");
		countries.add("UAE");
		countries.add("GERMANY");
		countries.add("ITALY");
		countries.add("OTHER");
		return countries;
	}
	
   /* It deletes record for the given id in URL and redirects to /viewemp   
   @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
   public String delete(@PathVariable int id){    
       dao.delete(id);    
       return "redirect:/viewemp";    
   } 
   
     @RequestMapping(value="/delete",method = RequestMethod.POST)    
   public String delete(Employee employee)
   {    
       empdao.deleteEmployee(employee);   
       return "redirect:/empllist";    
   }
   */
	 /* It displays object data into form for the given id.   
	    * The @PathVariable puts URL data into variable.  
	   
	   @GetMapping(value="/searchbyid/{id}")    
	   public String serachById(@PathVariable int id,ModelMap model) throws EmployeeByIdNotFoundException
	   {    
	       Employee employee = empser.searchEmployeeById(id);    
	       model.addAttribute("employee",employee);
	       model.addAttribute("success", "Record found !!!");
	       return "success";    
	   }  
	   */
}
