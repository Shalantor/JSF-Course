package exercise2;


import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RegisterBean {
	
	private String name,id,healthPlan,premium,phoneNumber;
	private Map<String,String[]> healthPlanInfo = new HashMap<>();
	
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
	}
	
	public String submit(){
		if( healthPlanInfo.containsKey(healthPlan) ){//valid health plan
			premium = healthPlanInfo.get(healthPlan)[0];
			phoneNumber = healthPlanInfo.get(healthPlan)[1];
			return "success";
		}
		else{
			return "error";
		}
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
