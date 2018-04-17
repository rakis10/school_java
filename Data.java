package pro;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.Scene;

public class Data implements Serializable {
	


	public Data tento;
//	public User[] users;
	public 	List<Ucitel> ucitelia;
	public  List<Student> studenti;//.asList
	//public static Student[] studenti;
	public  List<Test> tests;
	public  List <Rewards> rewards;
	
	public Data() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void addReward() {
		
	}
	
	public void addRewardTest(Student student, Test test, Question question, int points)
	{
		
	}
	public void addTest() {
		
	}
	public void getStudents() {
		
	}
	public  List<Ucitel> getTeachers() {
		return this.ucitelia;
		
	}
	public  List<Test> getTests() {
		if(this.tests == null) {
			this.tests = new ArrayList<Test>();
			tests.add(new Test());
		}
		return this.tests;
		}
	public void getQuestion(Test test) {
		
	}  

	public  User getUser(String atext) {

		User usr = null;
		
		for ( Ucitel uci : this.getTeachers()) {
			
			if (uci.getName().equals(atext)){
				usr = uci;
				break;
				};
			
		}
		for ( Student stu : studenti) {
			if (stu.getName().equals(atext)) {usr = stu; break;};
			
		}
		return usr;
	}

	public  void addTeacher(String string) {
		// TODO Auto-generated method stub
		this.ucitelia = new ArrayList<Ucitel>();
		Ucitel uci = new Ucitel();
		uci.setName(string);
		this.ucitelia.add(uci);// = add(ucitelia ,uci );
		
		 
	}

	public  void addStudent(String string) {
		// TODO Auto-generated method stub
		this.studenti = new ArrayList<Student>();
		Student stu = new Student();
		stu.setName(string);// = string;
		this.studenti.add(stu);
	}

	public  void createTest(Test ntest) {
		// TODO Auto-generated method stub
		if(this.tests == null)
			{this.tests = new ArrayList<Test>();}
		this.tests.add(ntest);
	}

	
}
