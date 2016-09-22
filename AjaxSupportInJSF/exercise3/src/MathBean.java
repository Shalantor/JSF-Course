import javax.faces.bean.ManagedBean;

@ManagedBean
public class MathBean {
	
	private Integer firstNumber,secondNumber,result;
	
	public void add(){
		result = firstNumber + secondNumber;
	}

	public Integer getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(Integer firstNumber) {
		this.firstNumber = firstNumber;
	}

	public Integer getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(Integer secondNumber) {
		this.secondNumber = secondNumber;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
	
	

}
