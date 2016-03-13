package com.kkiran.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("demoValidator")
public class DemoValidator implements Validator{
	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
		UIViewRoot rootForm = context.getViewRoot();
		Object inputName = ((UIInput) rootForm.findComponent("demo-form:name")).getSubmittedValue();
		Object country = ((UIInput) rootForm.findComponent("demo-form:country")).getSubmittedValue();
		Object phoneNumber = ((UIInput) rootForm.findComponent("demo-form:phone")).getSubmittedValue();
		Object comments = ((UIInput) rootForm.findComponent("demo-form:comments")).getSubmittedValue();
		
		Object checkBox = ((UIInput) rootForm.findComponent("demo-form:remember")).getSubmittedValue();
		
		
		FacesMessage msg = new FacesMessage("E-mail validation failed.", "Invalid E-mail format.");
		msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		throw new ValidatorException(msg);

		

	}


}
