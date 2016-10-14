import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

@FacesComponent("temperatureBean")
public class TemperatureBean extends UIInput implements NamingContainer{
	
	@Override
	protected Object getConvertedValue(FacesContext context,Object newSubmittedValue){
		UIInput temperatureInput = (UIInput) findComponent("temp");
		UIInput unitInput = (UIInput) findComponent("units");
		Double temperature = Double.parseDouble((String)temperatureInput.getSubmittedValue());
		String units = (String)unitInput.getSubmittedValue();
		if(units.equals("C")){
			return temperature;
		}
		else{
			return (temperature - 32 ) * 5/9;
		}
	}
	
	@Override
	public String getFamily(){
		return("javax.faces.NamingContainer");
	}
	
	@Override
	public Object getSubmittedValue(){
		return(this);
	}

}
