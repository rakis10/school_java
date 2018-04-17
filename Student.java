package pro;

import java.io.Serializable;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class Student implements User, Serializable{
	
	public boolean isTeacher = false;
	public String name;
	public void setName(String meno) {
		this.name =  meno;
	}
	
	public void doTest() {
		
	}
 
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

//	@Override
//	public FlowPane gui(User usr) {
//		// TODO Auto-generated method stub
//		FlowPane pane = new FlowPane();
//		Button btn = new Button("absolvuj test");
//		ComboBox cb = new ComboBox();
//		cb.getItems().addAll(Data.getTests());		
//		TextField tf = new TextField("ziak");
//		btn.setOnAction(e->abs((Test)cb.getSelectionModel().getSelectedItem()));//getChoice(cb)));
//		pane.getChildren().add(btn);	
//		pane.getChildren().add(tf);		
//		pane.getChildren().add(cb);		
//		
//		return pane;
//	}
	private void getChoice(ChoiceBox<String> cb) {
		// TODO Auto-generated method stub
		String test = cb.getValue();
		}
	private void abs(Data d, Test object) {
		// TODO Auto-generated method stub
		System.out.print(object.questions);
		FlowPane pane = new FlowPane();
		Button btn = new Button("absolvuj test");
		System.out.print(object.get().get(0).otazku);
		Label tf = new Label(object.get().get(0).otazku);
		Button b = new Button("HOME");
		b.setOnAction(e->Start.pop());
		  pane.getChildren().add(b);
		
		//btn.setOnAction(e->abs((Test)cb.getSelectionModel().getSelectedItem()));//getChoice(cb)));
		pane.getChildren().add(btn);	
		pane.getChildren().add(tf);
		Generate.setScene(pane);
		
	}

	@Override
	public FlowPane gui(User usr, Data d) {
		FlowPane pane = new FlowPane();
		Button btn = new Button("absolvuj test");
		ComboBox cb = new ComboBox();
		cb.getItems().addAll(d.getTests());		
		TextField tf = new TextField("ziak");
		btn.setOnAction(e->abs(d,(Test)cb.getSelectionModel().getSelectedItem()));//getChoice(cb)));
		pane.getChildren().add(btn);	
		pane.getChildren().add(tf);		
		pane.getChildren().add(cb);		
		
		return pane;
	}

	@Override
	public FlowPane gui(User usr) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
