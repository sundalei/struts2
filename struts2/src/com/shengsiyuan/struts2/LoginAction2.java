package com.shengsiyuan.struts2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.shengsiyuan.bean.Person;

public class LoginAction2 extends ActionSupport implements ModelDriven<Person>, Preparable {
	
	@Override
	public void prepare() throws Exception {
		System.out.println("prepare method is invoked!");
	}

	private static final long serialVersionUID = 1L;
	
	private Person person = new Person();

	@Override
	public Person getModel() {
		System.out.println("getModel method is invoked!");
		return person;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute method is invoked!");
//		System.out.println(person.getUsername());
		
		return SUCCESS;
	}

}
