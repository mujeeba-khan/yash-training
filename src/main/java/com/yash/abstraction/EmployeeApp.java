package com.yash.abstraction;

public class EmployeeApp {

	public static void main(String[] args) {
		
		//Employee e = new Employee();
		Manager m = new Manager();
		m.getSal();
		m.getCompanyName();
		m.getDesg();
		m.getId();
		System.out.println(Employee.city);
		Employee.getPincode(); //m.getPincode();
		Employee.city="Pune";
		m.withdrawMoney();
		
	}

}
