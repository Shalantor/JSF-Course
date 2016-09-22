import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelperBean {
	
	private Integer timesPressed = 0;

	public Integer getTimesPressed() {
		return timesPressed;
	}


	public Date getCurrentTime(){
		return new Date();
	}
	
	public void increment(){
		timesPressed = timesPressed + 1;
	}
	
}
