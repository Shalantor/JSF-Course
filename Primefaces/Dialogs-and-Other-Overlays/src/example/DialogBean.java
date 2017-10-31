package example;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DialogBean {
	
	private Integer number = (int)(Math.random() * 1000);
	private Integer number2 = (int)(Math.random() * 1000);

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumber2() {
		return number2;
	}

	public void setNumber2(Integer number2) {
		this.number2 = number2;
	}
	
	public String randomize() {
		number2 = (int)(Math.random() * 1000);
		return(null);
	}

}
