package com.yash.oopsconceptdemo.labassignments;

public class Employee {

	String emp_Name;
	String emp_Designation;
	int emp_Id;
	
	static int employees = 0;
	
	{
		employees +=1;
	}
	
	public Employee(String emp_Name, String emp_Designation, int emp_Id) {
		super();
		this.emp_Name = emp_Name;
		this.emp_Designation = emp_Designation;
		this.emp_Id = emp_Id;
	}

	@Override
	public String toString() {
		return "\nEmployee [emp_Name=" + emp_Name + ", emp_Designation=" + emp_Designation + ", emp_Id=" + emp_Id + "]";
	}



	public static void main(String[] args) {
		
		Employee e = new Employee("Abcd","Trainer",123);
		Employee e1 = new Employee("Xyzk","Programmer",1234);

		System.out.println(e+"\n"+e1);
		System.out.println("Total no. of employees: "+ employees);
	}

}
