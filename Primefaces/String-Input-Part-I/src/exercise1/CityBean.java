package exercise1;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CityBean {
	
	private static final String cities="Atlanta,Athens,Arizona,Antalya"
			+ ",Aurora,Berlin,Bagdad,Bonn,Budapest,Barcelona";
	
	private static final String[] citiesArray = cities.split(",");
	
	private String selectedCity;

	public String getSelectedCity() {
		return selectedCity;
	}

	public void setSelectedCity(String selectedCity) {
		this.selectedCity = selectedCity;
	}
	
	public List<String> autocompleteCity(String prefix){
		List<String> matches = new ArrayList<>();
		
		for(String city: citiesArray) {
			if(city.toUpperCase().startsWith(prefix.toUpperCase())) {
				matches.add(city);
			}
		}
		return(matches);
	}
	
	public String submit() {
		return "selected-city";
	}
}
