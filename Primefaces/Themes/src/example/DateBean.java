package example;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DateBean {
	
	private String date = new Date().toString();

	public String getDate() {
		date = new Date().toString();
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
