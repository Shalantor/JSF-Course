package exercise1;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CoffeeBean {
	
	private float coffeeAmount = 0.25F;

	public float getCoffeeAmount() {
		return coffeeAmount;
	}

	public void setCoffeeAmount(float coffeeAmount) {
		this.coffeeAmount = coffeeAmount;
	}
	
	

}
