import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class ColorPrefs {
	
	private String foreground = "black";
	private String background = "white";
	private List<String> colors = new ArrayList<>();
	
	public ColorPrefs(){
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("blue");
		colors.add("black");
		colors.add("white");
	}
	
	public String getForeground() {
		return foreground;
	}
	
	public void setForeground(String foreground) {
		this.foreground = foreground;
	}
	
	public String getBackground() {
		return background;
	}
	
	public void setBackground(String background) {
		this.background = background;
	}
	
	public List<String> getColors() {
		return colors;
	}
	
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	

}
