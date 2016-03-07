package com.shengsiyuan.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.shengsiyuan.struts2.LoginAction;

public class LoginInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		if(LoginAction.class == invocation.getAction().getClass()) {
			return invocation.invoke();
		}
		
		ActionContext context = invocation.getInvocationContext();
		Map<String, Object> map = context.getSession();
		
		if(null == map.get("userInfo")) {
			return Action.LOGIN;
		}
		
		return invocation.invoke();
	}

}
