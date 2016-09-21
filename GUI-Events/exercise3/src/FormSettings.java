import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FormSettings {

	private String language="English";
	private String[] languages = {"English","Deutsch"};
	private Map<String,String> info = new HashMap<>();
	private Locale locale = new Locale("en");
	
	public FormSettings(){
		info.put("English", "en");
		info.put("Deutsch","de");
	}
	
	
	public Locale getLocale() {
		return locale;
	}
	
	public void setLocale(Locale locale){
		this.locale = locale;
	}

	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
		locale = new Locale(info.get(language));
	}
	
	public String[] getLanguages() {
		return languages;
	}
	
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	
	
}
