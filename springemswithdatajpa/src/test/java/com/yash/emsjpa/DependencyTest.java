package com.yash.emsjpa;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DependencyTest 
{
	@Autowired
	DataSource datasource;
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void checkInjectedComponentsAreNotNull()
	{
		Assert.assertNotNull(datasource);
		Assert.assertNotNull(context);
	}
}
