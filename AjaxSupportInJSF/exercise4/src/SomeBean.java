import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SomeBean {
	
	private String currentPage = "A";
	
	public void navigate(){
		
		double result = Math.random();
		
		if(currentPage.equals("A")){
			if(result > 0.5){
				currentPage = "B";
			}
			else{
				currentPage = "Defeat";
			}
		}
		else if(currentPage.equals("B")){
			if(result > 0.5){
				currentPage = "C";
			}
			else{
				currentPage = "Defeat";
			}			
		}
		else if(currentPage.equals("C")){
			if(result > 0.5){
				currentPage = "Victory";
			}
			else{
				currentPage = "Defeat";
			}				
		}
	}
	
	public void reset(){
		currentPage = "A";
	}

	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	
	

}
