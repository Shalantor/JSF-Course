import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestBean {
	
	private String[] colors= {"red","blue","green","black"};
	private List<String> meals = new ArrayList<>();
	
	public TestBean(){
		meals.add("soup");
		meals.add("fish fillet");
		meals.add("fried chips");
		meals.add("steak");
	}

	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	public List<String> getMeals() {
		return meals;
	}

	public void setMeals(List<String> meals) {
		this.meals = meals;
	}
	
	

}
