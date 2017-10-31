package example;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AuctionBean {
	
	private String ID;
	private Double amount;
	
	public String enter() {
		return "confirmation";
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}
