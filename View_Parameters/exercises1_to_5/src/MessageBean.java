import javax.faces.bean.ManagedBean;

@ManagedBean
public class MessageBean {
	
	private String message = "Hello";
	private String fontSize = "36px";
	
	public String getMessageSpan(){
		return "<span style='font-size: " + fontSize + "'>" + message + "</span>";
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getFontSize() {
		return fontSize;
	}
	
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}
	
	

}
