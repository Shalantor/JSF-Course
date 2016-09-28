package coreservlets;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestScores {
	
	private Integer exam1,exam2,exam3,exam4;
	
	public TestScores(Integer exam1,Integer exam2,Integer exam3,Integer exam4){
		this.exam1 = exam1;
		this.exam2 = exam2;
		this.exam3 = exam3;
		this.exam4 = exam4;
	}

	public Integer getExam1() {
		return exam1;
	}

	public void setExam1(Integer exam1) {
		this.exam1 = exam1;
	}

	public Integer getExam2() {
		return exam2;
	}

	public void setExam2(Integer exam2) {
		this.exam2 = exam2;
	}

	public Integer getExam3() {
		return exam3;
	}

	public void setExam3(Integer exam3) {
		this.exam3 = exam3;
	}

	public Integer getExam4() {
		return exam4;
	}

	public void setExam4(Integer exam4) {
		this.exam4 = exam4;
	}
	
	

}
