import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelperBean {
	
	private String state,population,footballTeam;
	private List<String> states = new ArrayList<>();
	private Map<String,String[]> stateInfo = new HashMap<>();
	
	public HelperBean(){
		
		String[] temp1 = {"350.000","Kaitos"};
		String[] temp2 = {"750.000","Bakers"};
		String[] temp3 = {"7.850.000","Kiters"};
		
		states.add("Philadelphia");
		states.add("Baltimore");
		states.add("Washington DC");
		
		stateInfo.put("Philadelphia",temp1);
		stateInfo.put("Baltimore",temp2);
		stateInfo.put("Washington DC",temp3);
		
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getFootballTeam() {
		return footballTeam;
	}

	public void setFootballTeam(String footballTeam) {
		this.footballTeam = footballTeam;
	}

	public List<String> getStates() {
		return states;
	}

	public void setStates(List<String> states) {
		this.states = states;
	}

	public Map<String, String[]> getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(Map<String, String[]> stateInfo) {
		this.stateInfo = stateInfo;
	}
	
	public void change(){
		population = stateInfo.get(state)[0];
		footballTeam = stateInfo.get(state)[1];
	}
	
}
