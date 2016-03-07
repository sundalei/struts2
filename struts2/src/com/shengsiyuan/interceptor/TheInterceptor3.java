package com.shengsiyuan.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.shengsiyuan.listener.TheListener;

public class TheInterceptor3 extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
//		System.out.println("invocation: " + invocation);
		
		invocation.addPreResultListener(new TheListener());
		
		System.out.println("before interceptor3...");
		
		String result = invocation.invoke();
		
		System.out.println("after interceptor3...");
		
		return result;
	}

}
