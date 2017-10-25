package exercise1;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TicketBean {
	
	private int ticketNum = 2; /*Initialize with minimum amount of tickets*/

	public int getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}
	
	

}
