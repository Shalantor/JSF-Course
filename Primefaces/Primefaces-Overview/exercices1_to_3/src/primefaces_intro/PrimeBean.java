package primefaces_intro;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PrimeBean {
	
	int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
