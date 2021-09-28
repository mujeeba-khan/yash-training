package com.yash.ems.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	private JdbcTemplate jdbcTemplateObj;

	public EmployeeDaoImpl() {}
	
	public EmployeeDaoImpl(DataSource dataSource) {
		jdbcTemplateObj = new JdbcTemplate(dataSource);
	}

	
	public void saveEmployee(Employee employee)
	{
		String sqlInsertQuery = "INSERT INTO employee (name, salary, department, designation, address) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplateObj.update(sqlInsertQuery,new Object[]{ employee.getName(), employee.getSalary(), employee.getDepartment(), employee.getDesignation(), employee.getAddress()});
       
	}

	public List<Employee> getEmployeeList()
	{
		 String sqlSelectQuery = "SELECT * FROM employee";
         List<Employee> emplist = jdbcTemplateObj.query(sqlSelectQuery, new RowMapper<Employee>() {
             public Employee mapRow(ResultSet result, int rowNum) throws SQLException {
                 Employee empl = new Employee();
                 empl.setId(result.getLong("id"));
                 empl.setName(result.getString("name"));
                 empl.setSalary(result.getDouble("salary"));
                 empl.setDepartment(result.getString("department"));
                 empl.setDesignation(result.getString("designation"));
                 empl.setAddress(result.getString("address"));
                 
                 return empl;
             }
         });
         
		return emplist;
	}

	public void updateEmployee(Employee employee)
	{
		String sqlUpdateQuery = "Update employee set name=?,salary=?,department=?,designation=?,address=? where id=?";
        jdbcTemplateObj.update(sqlUpdateQuery,new Object[] {employee.getName(), employee.getSalary(), employee.getDepartment(), employee.getDesignation(), employee.getAddress(), employee.getId()});
		
	}

	public void deleteEmployee(int eid)
	{
		String sqlDeleteQuery = "DELETE FROM employee where id=?";
        jdbcTemplateObj.update(sqlDeleteQuery,new Object[] {eid});
		
	}

	
	
}
