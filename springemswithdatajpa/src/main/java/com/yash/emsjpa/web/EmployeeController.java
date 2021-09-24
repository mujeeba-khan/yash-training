package com.yash.emsjpa.web;
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
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yash.emsjpa.repository.EmployeeRepository;
import com.yash.emsjpa.model.Employee;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class EmployeeController
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/employees") //http://localhost:8081/api/employees
    public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) String name)
	{
      try 
      {
        List<Employee> employees = new ArrayList<Employee>();

        if (name == null)
        	employeeRepository.findAll().forEach(employees::add);
        else
        	employeeRepository.searchEmployeeByName(name).forEach(employees::add);


        if (employees.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(employees, HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
	
	@PostMapping("/employeeinsert")
	public String insertemployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "employee insert!!";
	}
	
	@PutMapping("/update/{id}")
    public String putEmployee(@PathVariable int id, @RequestBody Employee employee) {
	    Employee emp = new Employee();
	    emp.setId(id);
	    emp.setName(employee.getName());
	    emp.setSalary(employee.getSalary());
	    emp.setDepartment(employee.getDepartment());
	    emp.setDesignation(employee.getDesignation());
	    emp.setAddress(employee.getAddress());
	    employeeRepository.save(emp);
	    return "Successfully Updated!!!";
    }
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("id") int id) {
	try 
	{
		employeeRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e)
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping("/employeeById") 
    public Optional<Employee> getEmployeeById(@RequestParam(required = true) int id)
	{
		Optional<Employee> emp = employeeRepository.findById(id);
        return emp;
    }
	
	
}
