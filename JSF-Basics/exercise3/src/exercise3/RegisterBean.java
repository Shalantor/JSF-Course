package exercise3;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RegisterBean {

	private String firstName,lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String checkValidation(){
		if( (firstName.trim() == "") || (lastName.trim() == "")  ){
			return "error";
		}
		else{
			return "success";
		}
	}
	
}
	
