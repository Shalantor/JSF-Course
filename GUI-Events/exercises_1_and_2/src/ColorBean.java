import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class ColorBean {
	
	private String[] colorPrefs = {"light","dark"};
	private int currentColor = 0;
	
	public String getBodyStyleClass(){
		return colorPrefs[currentColor];
	}
	
	public void inverseVideo1(ActionEvent e){
		currentColor = (currentColor + 1) % 2;
	}
	
	public void inverseVideo2(ValueChangeEvent e){
		currentColor = (currentColor + 1) % 2;
	}
	
}
