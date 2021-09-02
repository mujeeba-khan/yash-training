

package com.yash.emshibernate1.model;
/*
 *  POJO Employee class 
 *  containing instance variables, constructors
 *  getters and toString() method
 */

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

@Entity  
public class Employee 
{
	@Id
	@Column (name = "Id" ,columnDefinition="INTEGER")
	private int id;
	
	@Column (name = "Name")
	private String name;
	
	@Column (name = "Salary")
	private double salary;
	
	@Column (name = "Department")
	private String department;
	
	@Column (name = "Designation")
	private String designation;
	
	@Embedded
	@AttributeOverride (name="City", column=@Column(name="New_City"))
	private Address address;
	
	@ManyToMany
    private Collection<Vehicles> vehicle = new ArrayList<Vehicles>();
    
	//@ElementCollection(fetch=FetchType.LAZY)
	@ElementCollection(fetch=FetchType.EAGER)
	private Collection<Project> lisOfProjects = new ArrayList<Project>();
	
	/*
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	*/
	
	public Employee() {
		super();
	}
	
	/*
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}*/

	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	/*
	public Collection<Projects> getProjects() {
		return projects;
	}

	public void setProjects(Collection<Projects> projects) {
		this.projects = projects;
	}
	*/
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public String getDepartment() {
		return department;
	}


	public String getDesignation() {
		return designation;
	}


	public Address getAddress() {
		return address;
	}

	/*
	public Collection<Vehicles> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicles> vehicle) {
		this.vehicle = vehicle;
	}
	*/
	
	public Collection<Project> getLisOfProjects() {
		return lisOfProjects;
	}

	public void setLisOfProjects(Collection<Project> lisOfProjects) {
		this.lisOfProjects = lisOfProjects;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", designation=" + designation + ", address=" + address + ", vehicle=" + ", lisOfProjects="
				+ lisOfProjects + "]";
	}
	
	
	
}	

