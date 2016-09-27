import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class GradeBean {
	
	private List<QuarterlyGrades> grades = new ArrayList<>();
	
	public GradeBean(){
		for(int i =1; i <= 10;i++){
			Integer[] tempGrades = {i*2,i+3,i*34,i+12,i+9};
			grades.add(new QuarterlyGrades(tempGrades));
		}
	}

}
