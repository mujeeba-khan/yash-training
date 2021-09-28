package com.yash.emsjpa.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.yash.emsjpa.model.Employee;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class EmployeeRepositoryTest {

	 @Autowired
	 EmployeeRepository employeeRepository;
	 
	 @Test
	 @Transactional
	 public void whenSave_shouldReturn_listSizeGreaterThanZero()
	 {
		 Employee emp = new Employee(0,"TestName",012,"TestDept","TestDesig","TestAddress");
		 employeeRepository.save(emp);
		 assertEquals(employeeRepository.findAll().size(),1);
	 }
	 
	 
}
