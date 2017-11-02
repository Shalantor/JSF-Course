package example;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Person {
	
	private String firstName,lastName,email;
	private Integer age;
	
	public Person(String firstName,String lastName, String email,int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
