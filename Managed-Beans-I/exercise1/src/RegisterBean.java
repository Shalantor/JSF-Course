import javax.faces.bean.ManagedBean;

@ManagedBean
public class RegisterBean {
	
	private String name,id,healthPlan;
	
	public String submit(){
		if( (name.trim() == "") || (id.trim() == "") || (healthPlan.trim() == "") ){
			return "error";
		}
		else{
			return "success";
		}
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
