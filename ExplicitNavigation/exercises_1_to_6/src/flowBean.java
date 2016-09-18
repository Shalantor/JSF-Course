import javax.faces.bean.ManagedBean;

@ManagedBean
public class flowBean {

	public String firstRandomPage(){
		if( Math.random() > 0.5 ){
			return "two";
		}
		else{
			return "lose";
		}
	}
	
	public String secondRandomPage(){
		if( Math.random() > 0.5 ){
			return "three";
		}
		else{
			return "lose";
		}
	}
	
	public String thirdRandomPage(){
		if( Math.random() > 0.5 ){
			return "win";
		}
		else{
			return "lose";
		}
	}
	
	
}
