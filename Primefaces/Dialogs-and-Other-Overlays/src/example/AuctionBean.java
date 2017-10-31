package example;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class AuctionBean {
	
	private String ID;
	private Double amount;
	
	public String enter() {
		return "confirmation";
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public String showDialogMessage() {
		String messageText = "You entered" + amount + " dollars with ID: " + ID ;
		FacesMessage message = new FacesMessage(messageText);
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, message);
		return(null);
	}

}
