package com.yash.newreststudent.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.yash.newreststudent.model.Student;
import com.yash.newreststudent.serviceimpl.StudentServiceImpl;

@Path("/students")
public class StudentController
{
	StudentServiceImpl sser = new StudentServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents()
	{
		List<Student> listOfStudents = sser.getStudents();
		return listOfStudents;
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response add(Student st) {
	    sser.addStudent(st);
	    return Response.ok().build();
	    
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response update(@PathParam("id") int id, Student st) {
		st.setId(id);
	    if (sser.updateStudent(st)) {
	        return Response.ok().build();
	    } else {
	        return Response.notModified().build();
	    }
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") int id) {
	    if (sser.deleteStudent(id)) {
	        return Response.ok().build();
	    } else {
	        return Response.notModified().build();
	    }
	}
}
