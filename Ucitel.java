package pro;

import java.io.Serializable;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;

public class Ucitel implements User,Serializable{
	public String name;
	public Data a;
	public boolean isTeacher = true;
	private Data data;

	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}





	@Override
	public FlowPane gui(User usr, Data d) {
		// TODO Auto-generated method stub
		FlowPane pane = new FlowPane();
		Button btn = new Button();
		TextField tf = new TextField("test1");
		btn.setOnAction(e->vytvorTest(d,tf.getText()));
		pane.getChildren().add(tf);		
		pane.getChildren().add(btn);
		return pane;
	} 
	public void sranda(Test ntest) {
		FlowPane fp = new FlowPane();
		TextField tf = new TextField("ako?");
		Button btn = new Button("ukonci test");
		Button hb = new Button("HOME");
		hb.setOnAction(e-> home());
		fp.getChildren().add(tf);
		fp.getChildren().add(hb);
		btn.setOnAction(e->otazka(tf.getText(), ntest));
		fp.getChildren().add(btn);
		Generate.setScene(fp);
	}

	public void home() {
		// TODO Auto-generated method stub
		Start.pop();
	}





	private void otazka(String text, Test ntest) {
		// TODO Auto-generated method stub
		String[] lol = new String[] {text, "ano", "nie"};
		ntest.addQuestion(lol);
		System.out.print("okej \n");
		Generate.save(this.data);
		Start.pop();
	}





	private void vytvorTest(Data d, String string) {
		// TODO Auto-generated method stub
		
		Test ntest = new Test(string);
		//Test nTest = 
		sranda(ntest);
		d.createTest(ntest);
		this.data = d;
		//Serial.save(d);
		
		System.out.print(d.getTests());
	}


	@Override
	public void setName(String str) {
		// TODO Auto-generated method stub
		this.name = str;
	}





	@Override
	public FlowPane gui(User usr) {
		// TODO Auto-generated method stub
		return null;
	}

}
