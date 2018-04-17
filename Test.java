package pro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javafx.stage.Stage;

public class Test extends Data implements Serializable{
	public List<Question> questions;
	public String name;


	public Test(String string) {
		// TODO Auto-generated constructor stub
		super();
		this.name = string;
		
	
		
	
	}
	public Test() {
		// TODO Auto-generated constructor stub
		this.name = "lol";
		addArray(new Question("aa"));
	}
	public void addQuestion(String[] lol) {
		Question q = new Question("");
		q.set(lol);
		addArray(q);
		
	}
	public void addArray(Question q) {
		this.questions = new ArrayList<Question>();
		this.questions.add(q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	public Question getQuestions(String meno) {
		Question qe = null;
		for (Question q : this.questions ) {
			if (q.name == meno) {
				qe = q;
			}
		}
			
		
		return qe;
	}
	public List<Question> get() {
		return this.questions;
	}

}
