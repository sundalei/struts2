package com.shengsiyuan.struts2;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.shengsiyuan.bean.User;
import com.shengsiyuan.service.LoginService;
import com.shengsiyuan.service.impl.LoginServiceImpl;

@ParentPackage("struts-default")
@Action(value="login", results={@Result(name="success", location="/login.jsp"),
		@Result(name="input", location="/login.jsp")})
public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private String password;
	
	private int age;
	
	private Date date;
	
	private LoginService loginService = new LoginServiceImpl();

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
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String execute() throws Exception {
//		if(!"hello".equals(username)) {
//			throw new UsernameException("username invalid");
//		}
//		
//		if(!"world".equals(password)) {
//			throw new PasswordException("password invalid");
//		}
//		
//		return SUCCESS;
		
//		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpSession session = request.getSession();
//		
//		session.setAttribute("hello", "world");
//		
//		ActionContext actionContext = ActionContext.getContext();
//		Map<String, Object> map = actionContext.getSession();
//		
//		Object obj = map.get("hello");
//		System.out.println(obj);
		
		if(this.loginService.isLogin(username, password)) {
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			
			Map<String, Object> map = ActionContext.getContext().getSession();
			map.put("userInfo", user);
			
			return SUCCESS;
		}
		return INPUT;
	}
	
	public String myExecute() throws Exception {
		System.out.println("myExecute invoked.");
		return SUCCESS;
	}
	
	public void validateMyExecute() 
	{
		System.out.println("validateMyExecute invoked.");
	}

	public void validate() {
//		System.out.println("validate invoked.");
	}
}
