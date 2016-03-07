package com.shengsiyuan.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class Action1 extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;
	
	private String usernameAndPassword;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsernameAndPassword() {
		return usernameAndPassword;
	}

	public void setUsernameAndPassword(String usernameAndPassword) {
		this.usernameAndPassword = usernameAndPassword;
	}

	@Override
	public String execute() throws Exception {
		this.usernameAndPassword = this.username + this.password;
		
		return SUCCESS;
	}
	
	public String myExecute() throws Exception {
		System.out.println("myExecute invoked!");
		this.usernameAndPassword = this.username + this.password;
		return SUCCESS;
	}
}
