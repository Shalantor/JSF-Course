package review_exercises;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LotteryBean {
	
	private String mail;
	private int number;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String submit() {
		return "result";
	}

}
