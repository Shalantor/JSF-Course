import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class RegisterBean {
	
	private String username,firstPassword,secondPassword;
	
	public String submit(){
		
		if( firstPassword.equals(secondPassword)){
			return "details";
		}
		else{
			firstPassword = null;
			secondPassword = null;
			FacesMessage errorMessage = new FacesMessage("Please enter matching passwords");
			errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage("inputForm:password1",errorMessage);
			return null;
		}
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstPassword() {
		return firstPassword;
	}

	public void setFirstPassword(String firstPassword) {
		this.firstPassword = firstPassword;
	}

	public String getSecondPassword() {
		return secondPassword;
	}

	public void setSecondPassword(String secondPassword) {
		this.secondPassword = secondPassword;
	}
	
	

}
