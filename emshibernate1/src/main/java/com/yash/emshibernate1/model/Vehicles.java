package com.yash.emshibernate1.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="VEHICLE")
public class Vehicles 
{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="VEHICLE_ID")
    private int vehicleId;
    
    @Column(name="VEHICLE_NAME")
    private String vehicleName;
    
    //@ManyToMany(mappedBy="vehicle")
    //@ManyToMany
    private Collection<Employee> employees = new ArrayList<Employee>();

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Collection<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Collection<Employee> employees) {
		this.employees = employees;
	}
    
    
}
