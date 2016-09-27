import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class RegisterBean {
	
	private String username, password1="", password2="";
	private List<String> invalidPasswords = new ArrayList<>();
	
	public RegisterBean(){
		invalidPasswords.add("123456");
		invalidPasswords.add("12345678");
		invalidPasswords.add("qwerty");
		invalidPasswords.add("adc123");
	}
	
	/*Check if password is safe*/
	public void validatePassword(FacesContext context,UIComponent componentToValidate, Object value) throws ValidatorException {
		
		String input = (String) value;
		
		for(String searchString : invalidPasswords){
			if (input.equals(searchString)){
				FacesMessage errorMessage = new FacesMessage("Please enter a safer password");
				errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(errorMessage);
			}
		}
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	
	

}
