import javax.faces.bean.ManagedBean;

@ManagedBean
public class SoupBean {

	private Double soupTemp;
	private String soupName;
	
	public Double getSoupTemp() {
		return soupTemp;
	}
	
	public void setSoupTemp(Double soupTemp) {
		this.soupTemp = soupTemp;
	}
	
	public String getSoupName() {
		return soupName;
	}
	
	public void setSoupName(String soupName) {
		this.soupName = soupName;
	}
	
	public String showOrder(){
		return "orderResult.xhtml";
	}
	
}
