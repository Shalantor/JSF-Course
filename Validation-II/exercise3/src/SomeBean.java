import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SomeBean {
	
	private Locale locale ;
	private String currentLocale ;
	private String name = "";
	
	public SomeBean(){
		locale = new Locale("de");
		currentLocale = "de";
	}
	
	public String changeLocale(){
		if(currentLocale.equals("en")){
			locale = new Locale("de");
			currentLocale = "de";
		}
		else{
			locale = new Locale("en");
			currentLocale = "en";
		}
		return null;
	}
	
	public Locale getLocale() {
		return locale;
	}
	
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

}
