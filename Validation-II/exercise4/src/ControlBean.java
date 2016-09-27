import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ControlBean {
	
	private String mail,firstURL,secondURL;
	
	public String submit(){
		if(firstURL.equals(secondURL)){
			FacesMessage errorMessage = new FacesMessage("URLs must not match");
			errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage("inputForm:url1", errorMessage);
			return null;
		}
		else{
			return "success";
		}
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFirstURL() {
		return firstURL;
	}

	public void setFirstURL(String firstURL) {
		this.firstURL = firstURL;
	}

	public String getSecondURL() {
		return secondURL;
	}

	public void setSecondURL(String secondURL) {
		this.secondURL = secondURL;
	}
	
	

}
