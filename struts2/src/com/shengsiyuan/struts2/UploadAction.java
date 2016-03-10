package com.shengsiyuan.struts2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private File file;
	
	private String fileFileName;
	
	private String fileContentType;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	@Override
	public String execute() throws Exception {
		String root = ServletActionContext.getRequest().getSession().getServletContext().getRealPath("upload");
		
		File destDirectory = new File(root);
		if(!destDirectory.exists()) {
			destDirectory.mkdirs();
		}
		File destFile = new File(destDirectory, fileFileName);
		FileUtils.copyFile(file, destFile);
		
		return SUCCESS;
	}

}
