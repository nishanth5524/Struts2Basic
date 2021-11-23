package com.struts2.action.mapping;

import com.opensymphony.xwork2.ActionSupport;

public class LinkAction extends ActionSupport {

	private String message;
	private String name;
	
	 public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() {
		setMessage("Execute Method Is Called In Struts2");
		System.out.println("Execute");
		return SUCCESS;
	}

	public String showTest() {
		setMessage("Show Method Is Called In Struts2");
		System.out.println("show");
		return SUCCESS;
	}
}