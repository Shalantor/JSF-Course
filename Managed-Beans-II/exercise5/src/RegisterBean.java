
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RegisterBean {
	
	private String name,id,healthPlan,premium,phoneNumber;
	private Map<String,String[]> healthPlanInfo = new HashMap<>();
	private List<String> temp = new ArrayList<>();
	
	//Instantiate map values
	public RegisterBean(){
		String[] info1 = { "1000" , "555-357" };
		String[] info2 = { "2200" , "555-567" };
		String[] info3 = { "500" , "555-090" };
		String[] info4 = { "1300" , "555-435" };
		healthPlanInfo.put("CMS",info1);
		healthPlanInfo.put("LCS",info2);
		healthPlanInfo.put("ABBA",info3);
		healthPlanInfo.put("ACDC",info4);
		temp.add("CMS");
		temp.add("LCS");
		temp.add("ABBA");
		temp.add("ACDC");
	}
	
	
	
	public List<String> getTemp() {
		return temp;
	}



	public void setTemp(List<String> temp) {
		this.temp = temp;
	}



	public String submit(){
		return "success";
	}
	
	

	public Map<String, String[]> getHealthPlanInfo() {
		return healthPlanInfo;
	}

	public void setHealthPlanInfo(Map<String, String[]> healthPlanInfo) {
		this.healthPlanInfo = healthPlanInfo;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHealthPlan() {
		return healthPlan;
	}

	public void setHealthPlan(String healthPlan) {
		this.healthPlan = healthPlan;
	}
	
	

}
