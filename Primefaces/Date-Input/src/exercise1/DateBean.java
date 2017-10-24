package exercise1;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DateBean {
	
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String enterDate() {
		return "result";
	}

}
