import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class RepeatBean {
	
	private List<String> colors = new ArrayList<>();
	private List<Name> names = new ArrayList<>();
	
	public RepeatBean(){
		/*Add values to color list*/
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("blue");
		colors.add("purple");
		colors.add("white");
		colors.add("black");
		colors.add("pink");
		
		/*Add values to name list*/
		names.add( new Name("John","Connor"));
		names.add( new Name("George","Karaolanis"));
		names.add( new Name("Conan","Edogawa"));
		names.add( new Name("John","Moriarty"));
		names.add( new Name("Sherlock","Holmes"));
		names.add( new Name("Nick","Fury"));
		names.add( new Name("Yugi","Muto"));
		names.add( new Name("Nikola","Tesla"));
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
