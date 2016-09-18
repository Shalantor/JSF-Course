
public class flowBean {

	private String currentPage = "one";
	
	public String randomPage(){
		
		if(Math.random() < 0.5){
			return "lose";
		}
		else if( currentPage.equals("one") ){
			currentPage = "two";
			return "two";
		}
		else if( currentPage.equals("two") ){
			currentPage = "three";
			return "three";			
		}
		else{
			return "win";	
		}
		
	}
	
}
