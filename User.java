package pro;

import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;

public interface User {
	
	String getName();
	Scene actual = null;
	void setName(String str);
	FlowPane gui(User usr);
	Boolean isTeacher = null;
	FlowPane gui(User usr, Data d);
	
//	public User getUser(String text) {
//		for ( Ucitel uci : ucitelia) {
//			if (uci.meno == text) {return uci;};
//			
//		}
//		for ( Student stu : studenti) {
//			if (stu.meno == text) {return stu;};
//			
//		}
//		return null;
//		
//	}
}
