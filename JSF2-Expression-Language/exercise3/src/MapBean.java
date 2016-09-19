import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MapBean {
	
	private Map<String,String> info = new HashMap<>();
	
	public MapBean(){
		info.put("1", "Stan");
		info.put("2", "Steve");
		info.put("3", "Roger");
		info.put("4", "Jeff");
	}

	public Map<String, String> getInfo() {
		return info;
	}

	public void setInfo(Map<String, String> info) {
		this.info = info;
	}
	
	

}
