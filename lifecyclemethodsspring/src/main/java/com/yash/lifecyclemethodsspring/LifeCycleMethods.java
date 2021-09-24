package com.yash.lifecyclemethodsspring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleMethods implements InitializingBean, DisposableBean
{
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initialization of bean...");
	}

	public void destroy() throws Exception {
		
		System.out.println("Bean will destroy now.");
		
	}
	
	
}
