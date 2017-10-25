package exercise1;

import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CityBean2 extends CityBean {
	
	private List<String> selectedCities;

	public List<String> getSelectedCities() {
		return selectedCities;
	}

	public void setSelectedCities(List<String> selectedCities) {
		this.selectedCities = selectedCities;
	}
}
