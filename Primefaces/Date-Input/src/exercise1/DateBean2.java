package exercise1;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class DateBean2 {
	
	private Date checkinDate,checkoutDate;

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	
	public String registry() {
		
		int diffInDays = (int)( (checkoutDate.getTime() - checkinDate.getTime()) 
                / (1000 * 60 * 60 * 24) );
		
		if(diffInDays >= 3) {
			return "result-mountain-retreat";
		}
		else {
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage errorMessage = new FacesMessage("Duration must be at least 3 days");
			errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, errorMessage);
			return(null);
		}
	}

}
