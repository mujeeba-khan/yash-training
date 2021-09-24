package com.yash.ems.serviceimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.ems.exception.EmployeeByIdNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{

	private JdbcTemplate jdbcTemplateObj;

	public EmployeeServiceImpl() {}
	
	public EmployeeServiceImpl(DataSource dataSource) {
		jdbcTemplateObj = new JdbcTemplate(dataSource);
	}
	
	
	public Employee searchEmployeeById(int eid) throws EmployeeByIdNotFoundException 
	{
		String sqlSelectQuery = "SELECT * FROM employee where id=?";
        Employee employee = jdbcTemplateObj.queryForObject(sqlSelectQuery, new Object[]{eid}, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet result, int rowNum) throws SQLException {
                Employee employee = new Employee();
                employee.setId(result.getLong("id"));
                employee.setName(result.getString("name"));
                employee.setSalary(result.getDouble("salary"));
                employee.setDepartment(result.getString("department"));
                employee.setDesignation(result.getString("designation"));
                employee.setAddress(result.getString("address"));
                
                return employee;
            }
        });
		
		return employee;
	}

	public Employee searchEmployeeByName(String ename) throws EmployeeByNameNotFoundException
	{
		String sqlSelectQuery = "SELECT * FROM employee where name=?";
        Employee employee = jdbcTemplateObj.queryForObject(sqlSelectQuery,new Object[]{ename}, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet result, int rowNum) throws SQLException {
                Employee employee = new Employee();
                employee.setName(result.getString("name"));
                employee.setId(result.getLong("id"));
                employee.setSalary(result.getDouble("salary"));
                employee.setDepartment(result.getString("department"));
                employee.setDesignation(result.getString("designation"));
                employee.setAddress(result.getString("address"));
                
                return employee;
            }
        });
		
		return employee;
	}
	
}
