package com.yash.springmvcform.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee 
{
	@NotNull
	private String uname;  

	@Size(min=4,message="required")  
	private String pass;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	} 
	
	
}
