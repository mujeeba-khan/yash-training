package com.yash.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

	//Logger log = Logger.getLogger(AuthenticationFilter.class);
	
	public void destroy() 
	{
		System.out.println("----------destroy method is called in-----------"
				+ this.getClass().getName());
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		System.out.println("----------doFilter method is called in-----------"
				+ this.getClass().getName());
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String username = req.getParameter("uname");
		String password = req.getParameter("pass");
		
		if(!(username.equalsIgnoreCase("freebirdy") && password.equals("123456")))
		{
			
			System.out.println("########----------Unauthorised request------------#########");
			res.sendRedirect("index.html");
		}
		else
		{
			chain.doFilter(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("----------init method is called in-----------"
				+ this.getClass().getName());
	}

}
