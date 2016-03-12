package com.shengsiyuan.struts2;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction2 extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int number;
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	private String filename;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public InputStream getDownloadFile() {
		if(number == 1) {
			this.filename = "setup_win_2.0.7.rar";
			return ServletActionContext.getServletContext().getResourceAsStream("/upload/setup_win_2.0.7.rar");
		} else {
			this.filename = "eMule0.50a-Installer.exe";
			return ServletActionContext.getServletContext().getResourceAsStream("/upload/eMule0.50a-Installer.exe");
		}
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	

}
