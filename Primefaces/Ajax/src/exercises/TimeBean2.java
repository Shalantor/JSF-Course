package exercises;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimeBean2 {
	
	private String currentTime = new SimpleDateFormat("hh:mm:ss")
			.format(new Date(System.currentTimeMillis()));

	public String getCurrentTime() {
		try {
			Thread.sleep(2500);
		} catch(InterruptedException ie) {}
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
