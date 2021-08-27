package com.yash.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("----------doGet method is called in-----------"
				+ this.getClass().getName());
		
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		
		out.println("Hello...Welcome to the world of servlet one...<br>");
		
	}

	

}
