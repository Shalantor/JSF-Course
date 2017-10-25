package exercise1;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FruitBean {
	
	private int oranges,apples;

	public int getOranges() {
		return oranges;
	}

	public void setOranges(int oranges) {
		this.oranges = oranges;
	}

	public int getApples() {
		return apples;
	}

	public void setApples(int apples) {
		this.apples = apples;
	}
	
	

}
