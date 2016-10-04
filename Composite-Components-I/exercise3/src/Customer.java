
public class Customer {
	
	private String firstName,lastName,ID;
	private Integer birthYear;
	
	public Customer(String firstName,String lastName,String ID,Integer birthYear){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		this.birthYear = birthYear;
		
	}

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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}
	
	

}
