package exercises;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NumBean {
	
	private int firstNum,secondNum,sum;

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public String addNumbers() {
		sum = firstNum + secondNum;
		return(null);
	}

}
