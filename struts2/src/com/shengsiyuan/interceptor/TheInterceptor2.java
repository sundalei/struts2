package com.shengsiyuan.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TheInterceptor2 extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("before interceptor2...");
		
//		System.out.println("interceptor2: " + arg0.getAction().getClass());
		
		String result = arg0.invoke();
		
		System.out.println("after interceptor2...");
		
		return result;
	}

}
