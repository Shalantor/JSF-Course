import java.util.Locale;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LocaleBean {
	
	public Locale getLocale(){
		if(Math.random() > 0.5){
			return new Locale("en");
		}
		else{
			return new Locale("de");
		}
	}

}
