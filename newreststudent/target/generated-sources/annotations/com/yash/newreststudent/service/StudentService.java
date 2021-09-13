package com.yash.newreststudent.service;

import java.util.List;

import com.yash.newreststudent.model.Student;

public interface StudentService
{
	public int addStudent(Student st);
	public List<Student> getStudents();
	public boolean updateStudent(Student st);
	public boolean deleteStudent(int sid);

}
