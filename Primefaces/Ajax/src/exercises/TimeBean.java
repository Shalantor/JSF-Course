package exercises;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimeBean {
	
	private String currentTime = new SimpleDateFormat("hh:mm:ss")
			.format(new Date(System.currentTimeMillis()));

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	
	public String newTime() {
		currentTime = new SimpleDateFormat("hh:mm:ss")
				.format(new Date(System.currentTimeMillis()));
		return(null);
	}

}
