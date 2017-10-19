package example;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("first-flow")
public class TestFlowBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

	public String getDate() {
		return date;
	}

	
}
