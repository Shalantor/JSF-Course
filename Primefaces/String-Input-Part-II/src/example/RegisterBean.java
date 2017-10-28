package example;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RegisterBean {
	
	private String username,password,foreground="0000ff",background="fdf5e6";

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

	public String getForeground() {
		return foreground;
	}

	public void setForeground(String foreground) {
		this.foreground = foreground;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}
	
	public String getStyle() {
		String style = String.format("color: #%s; background-color: #%s",
				foreground, background);
		return(style);
	}

}
