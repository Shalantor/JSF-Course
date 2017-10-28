package example;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RegisterBean {
	
	private String username,password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String register() {
		return "credentials";
	}

}
