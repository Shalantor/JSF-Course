import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelperBean {
	
	private Customer customer;
	
	public HelperBean(){
		customer = new Customer("John","Silver","Silver1412",1888);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
