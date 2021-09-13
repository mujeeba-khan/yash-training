package com.yash.newreststudent.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import com.yash.newreststudent.model.Student;
import com.yash.newreststudent.service.StudentService;

public class StudentServiceImpl implements StudentService
{
	static List<Student> slist = new ArrayList<Student>();
	private static StudentServiceImpl instance;
 
    static
    {
    	slist.add(new Student(1,"Allex","USA"));
		slist.add(new Student(2,"Allexa","USA"));
		slist.add(new Student(3,"Allen","USA"));
		slist.add(new Student(4,"Bob","USA"));
		slist.add(new Student(5,"Jerry","USA"));
    }
	
    public StudentServiceImpl() {}

    public int addStudent(Student st) {
		slist.add(st);
		return 0;
	}
    

	public List<Student> getStudents() {
		
		return slist;
	}

	public boolean updateStudent(Student st) {
		
		 int index = slist.indexOf(st);
	        if (index >= 0) {
	            slist.set(index, st);
	            return true;
	        }
		
		return false;
	}

	public boolean deleteStudent(int sid) {
		
		Student stud = new Student(sid);
        int index = slist.indexOf(stud);
        if (index >= 0) {
            slist.remove(index);
            return true;
        }
		
		return false;
		
		/*
		(new StudentServiceImpl()).addStudent();
		for(int i=0;i<str.length;i++)
		{
			if(str[i].getId()==sid)
			{
				slist.remove(i);
				
				System.out.println("Successfully removed \n");
				return true;
			}
		}
		
		return false;
		*/
	}

	

	

	

	


}
