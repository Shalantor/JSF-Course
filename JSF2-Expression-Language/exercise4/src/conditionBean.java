import javax.faces.bean.ManagedBean;

@ManagedBean
public class conditionBean {
	
	private Integer[] numbers = {1,-2,32,-5,3,0,-3};

	public Integer[] getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer[] numbers) {
		this.numbers = numbers;
	}
	
	

}
