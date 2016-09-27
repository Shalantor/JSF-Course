import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class RepeatBean {
	
	private List<String> colors = new ArrayList<>();
	
	public RepeatBean(){
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("blue");
		colors.add("purple");
		colors.add("white");
		colors.add("black");
		colors.add("pink");
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	
	

}
