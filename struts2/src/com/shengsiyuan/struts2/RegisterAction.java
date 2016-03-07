package com.shengsiyuan.struts2;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;
	
	private String repassword;
	
	private int age;
	
	private Date birthday;
	
	private Date graduation;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getGraduation() {
		return graduation;
	}

	public void setGraduation(Date graduation) {
		this.graduation = graduation;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public String myExecute() throws Exception {
		return SUCCESS;
	}

	@Override
	public void validate() {
		System.out.println("validate invoked!");
	}
	
	public void validateMyExecute() {
		System.out.println("validateMyExecute invoked!");
	}
	
}
