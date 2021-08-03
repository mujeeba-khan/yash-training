package com.yash.oopsconceptdemo.labassignments;

public class Hostel {
	
	int student_id;
	String student_name;
	String student_class;
	
	static int students_registered=0;
	
	{
		students_registered += 1;
	}
	
	public Hostel(int student_id, String student_name, String student_class) {
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_class = student_class;
	}

	@Override
	public String toString() {
		return "\nHostel [student_id=" + student_id + ", student_name=" + student_name + ", student_class="
				+ student_class + "]";
	}

	public static void main(String[] args) {
		
		Hostel h = new Hostel(12,"Jklm","XI");
		Hostel h1 = new Hostel(13,"Jklmn","XI");
		Hostel h2 = new Hostel(14,"Jklmo","XI");
		Hostel h3 = new Hostel(15,"Jklmp","XI");
		Hostel h4 = new Hostel(16,"Jklmq","XI");
		
		System.out.println(h+"\n"+h1+"\n"+h2+"\n"+h3+"\n"+h4);
		System.out.println("Total no. of students registered: "+students_registered);
		
	}

}
