package com.yash.lifecyclemethodsspring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LCMethods 
{
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	public void customInit() 
	{
		System.out.println("Method customInit() invoked...");
	}

	public void customDestroy() 
	{
		System.out.println("Method customDestroy() invoked...");
	}
	
	/*
	@PostConstruct
	public void customInit() 
	{
		System.out.println("Method customInit() invoked...");
	}
	
	@PreDestroy
	public void customDestroy() 
	{
		System.out.println("Method customDestroy() invoked...");
	}
	*/
}

