package com.shengsiyuan.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TheInterceptor1 implements Interceptor {

	private static final long serialVersionUID = 1L;
	
	private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		System.out.println("setTest");
		
		this.test = test;
	}

	@Override
	public void destroy() {

	}

	@Override
	public void init() {
		System.out.println("init invoked: " + test);
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("before interceptor1...");
		
//		System.out.println("interceptor1: " + invocation.getAction().getClass());
		
		String result = invocation.invoke();
		
		System.out.println("after interceptor1...");
		
		return result;
	}

}
