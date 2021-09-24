package com.yash.ems.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.service.EmployeeService;
import com.yash.ems.serviceimpl.EmployeeServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.yash.ems")
public class EmployeeInitializer 
{

	/*
	* Configure View Resolver 
	*/
	@Bean
	public ViewResolver viewResolver() 
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/empldb");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	@Bean
	public EmployeeDao getUserDao() {
		return new EmployeeDaoImpl(getDataSource());
	}
	
	@Bean
	public EmployeeService getUserDao1() {
		return new EmployeeServiceImpl(getDataSource());
	}
	
}
