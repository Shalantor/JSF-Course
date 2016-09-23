import javax.faces.bean.ManagedBean;

@ManagedBean
public class ValidatorBean {

	private String firstName,middleName,lastName,employeeID;
	private Integer buildingNumber;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	public Integer getBuildingNumber() {
		return buildingNumber;
	}
	
	public void setBuildingNumber(Integer buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	
}
