package com.kkiran.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Demo {
	
	private String name;
	
	private String country;
	private String phone;
	private String comments;
	private boolean remember;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public boolean isRemember() {
		return remember;
	}


	public void setRemember(boolean remember) {
		this.remember = remember;
	}

	
	public String save() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		if(!isRemember()) {
			if(getName() == null || getName().equals("")) {
				context.addMessage(null, new FacesMessage("Name is required"));
			}
			
			if(getCountry() == null || getCountry().equals("")) {
				context.addMessage(null, new FacesMessage("Country is required"));
			}
		}
		
		if(getPhone() == null || getPhone().equals("")) {
			context.addMessage(null, new FacesMessage("Phone is required"));
		}
		
		if(getComments() == null || getComments().equals("")) {
			context.addMessage(null, new FacesMessage("Comments are required"));
		}
		
		
		
		if(context.getMessageList().size() > 0) {
			return null;
		} else {
			///save the Data 
			return "demo-response";
		}
	}
	



}
