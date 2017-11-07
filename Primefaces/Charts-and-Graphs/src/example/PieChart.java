package example;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.PieChartModel;

@ManagedBean
public class PieChart {
	
	  private PieChartModel model;
	  
	  public PieChart() {
	    model = new PieChartModel();
	    model.set("Ps4", 45);
	    model.set("Xbox", 30);
	    model.set("Pc", 20);
	    model.set("Nintendo", 5);
	    model.setTitle("Example Pie Chart");
	    model.setLegendPosition("e");
	  }

	  public PieChartModel getModel() {
	    return(model);
	  }

}
