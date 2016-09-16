import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NameBean {
	
	private String selectedBoxName = "Sherlock Holmes";
	private String selectedRadioName = "Mycroft Holmes";
	private String selectedListName = "Cay";
	private String finalListName;
	private List<String> boxNames = new ArrayList<>();
	private List<String> radioNames = new ArrayList<>();
	private List<String> listNames = new ArrayList<>();
	
	public NameBean(){
		
		boxNames.add("Sherlock Holmes");
		boxNames.add("John Watson");
		boxNames.add("Irene Adler");
		
		radioNames.add("Mycroft Holmes");
		radioNames.add("Inspector Lestrade");
		radioNames.add("Professor Moriarty");
		
		listNames.add("Cay");
		listNames.add("David");
		listNames.add("Marty");
	}
	
	public List<String> getBoxNames() {
		return boxNames;
	}

	public void setBoxNames(List<String> boxNames) {
		this.boxNames = boxNames;
	}

	public List<String> getRadioNames() {
		return radioNames;
	}

	public void setRadioNames(List<String> radioNames) {
		this.radioNames = radioNames;
	}

	public List<String> getListNames() {
		return listNames;
	}

	public void setListNames(List<String> listNames) {
		this.listNames = listNames;
	}

	public String getSelectedBoxName() {
		return selectedBoxName;
	}

	public void setSelectedBoxName(String selectedBoxName) {
		this.selectedBoxName = selectedBoxName;
	}

	public String getSelectedRadioName() {
		return selectedRadioName;
	}

	public void setSelectedRadioName(String selectedRadioName) {
		this.selectedRadioName = selectedRadioName;
	}

	public String getSelectedListName() {
		return selectedListName;
	}

	public void setSelectedListName(String selectedListName) {
		
		if(selectedListName.equals("Cay")){
			finalListName = "Cay HorstMann";
		}
		else if(selectedListName.equals("David")){
			finalListName = "David Geary";
		}
		else{
			finalListName = "Marty Hall";
		}
		
		this.selectedListName = selectedListName;
	}

	public String getFinalListName() {
		return finalListName;
	}

	public void setFinalListName(String finalListName) {
		this.finalListName = finalListName;
	}
	
	public String showSelectedNames(){
		return "result";
	}

}
