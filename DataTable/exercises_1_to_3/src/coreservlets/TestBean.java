package coreservlets;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestBean {
	
	List<TestScores> scores = new ArrayList<>();
	
	public TestBean(){
		scores.add( new TestScores(10,9,6,4));
		scores.add( new TestScores(7,4,6,3));
		scores.add( new TestScores(2,9,8,6));
		scores.add( new TestScores(1,4,5,5));
		scores.add( new TestScores(3,4,2,9));
		scores.add( new TestScores(6,7,3,4));
	}

	public List<TestScores> getScores() {
		return scores;
	}

	public void setScores(List<TestScores> scores) {
		this.scores = scores;
	}

}
