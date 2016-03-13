package com.kkiran.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class Student implements ValueChangeListener{
	private String firstName;
	private String lastName;
	private String country;
	private String result;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void onSelectCountry(ValueChangeEvent vc) {
		 
        Object oval = vc.getOldValue();
        Object nval = vc.getNewValue();
 
        System.out.println("old val" + oval);
        System.out.println("new- val" + nval);
 
        if (nval != null) {
            result = "Newly changed value is:" + (String) nval;
 
        }
    }
	

	@Override
	public void processValueChange(ValueChangeEvent event)
			throws AbortProcessingException {
		 Object oldValue = event.getOldValue(); //get the old value
	     Object newValue = event.getNewValue(); //get the new value
	        
	     System.out.println("old val" + oldValue);
	     System.out.println("new- val" + newValue);
		
	}
	
	
}
