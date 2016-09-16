import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="holmes")
@ApplicationScoped
public class flowBean {

	public String firstRandomPage(){
		if( Math.random() > 0.5 ){
			return "second";
		}
		else{
			return "defeat";
		}
	}
	
	public String secondRandomPage(){
		if( Math.random() > 0.5 ){
			return "third";
		}
		else{
			return "defeat";
		}
	}
	
	public String thirdRandomPage(){
		if( Math.random() > 0.5 ){
			return "victory";
		}
		else{
			return "defeat";
		}
	}
	
	/*Application scoped means that the bean will be the same for all users that
	 * access this page, so it will be the exact same instance for everyone visiting.
	 */
	
}
