package com.yash.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/LogFilter")
public class LogFilter implements Filter {

	public void destroy() 
	{
		System.out.println("----------destroy method is called in-----------"
				+ this.getClass().getName());
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		response.setContentType("text/html"); 
		
		System.out.println("----------init method is called in-----------"
				+ this.getClass().getName());
		PrintWriter out = response.getWriter();
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		String ipadd = req.getRemoteAddr();
		//String a = req.getRemoteUser().toString();
		String b = req.getRemoteHost();
		//String c = req.getRequestURI();
		
		System.out.println("\nIP address: "+ipadd+"\nTime: "+LocalDateTime.now()
		+"\nRemote Host: "+b);
		
		out.println("<br>LogFilter is invoked before<br>");
		
		chain.doFilter(request, response);
		
		out.println("LogFilter is invoked after<br>");
	}

	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("----------init method is called in-----------"
				+ this.getClass().getName());
	}

}
