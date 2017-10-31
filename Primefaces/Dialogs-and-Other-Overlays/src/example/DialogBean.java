package example;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DialogBean {
	
	private Integer number = (int)(Math.random() * 1000);

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
