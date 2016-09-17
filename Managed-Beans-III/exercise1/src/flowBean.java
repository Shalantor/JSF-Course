import javax.faces.bean.ManagedBean;

@ManagedBean
public class flowBean {
	
	public String goToFirstPage(){
		return "first";
	}

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
	
	
}
