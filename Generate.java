package pro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Generate implements Serializable {
	static Stage stage;
	static int i = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private Data data;

	public  void login(Stage hlavneOkno)  {
		// TODO Auto-generated method stub
		//if (i==0) {s();i++;}
		s();
		//Data s = new Data();
		this.stage = hlavneOkno;
		FlowPane pane = new FlowPane();
		Button btn = new Button("login");
		TextField tf = new TextField("stu");
		Button newUser = new Button("Add user");
		newUser.setOnAction(e->CreateUser());
		pane.getChildren().add(btn);	
		pane.getChildren().add(newUser);
		pane.getChildren().add(tf);		
		//setScene(pane);
		btn.setOnAction(e->setScene(loguj(data,tf.getText())));
		Scene scene = new Scene(pane, 400, 300);
		
		hlavneOkno.setScene(scene);
		hlavneOkno.show();

	}
	private void CreateUser() {
		// TODO Auto-generated method stub
		Data data = new Data();
		data.addTeacher("ucit");
		data.addStudent("stu");
		this.data = data;
		Generate.save(data);
		
	}
	public static  void save(Data dataa) {
		try {
			FileOutputStream fileOut = new FileOutputStream("loginData.ser");
			ObjectOutputStream out;
			out = new ObjectOutputStream(fileOut);
			
			out.writeObject(dataa);
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	private   void s() {
		// TODO Auto-generated method stub
		//Data lol = load();
	
		//Serial.save();
//		Data data = new Data();
//		try {
//			 data = Serial.load();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {data
//			 data = Serial.load();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Data sa = new Data();
//			sa.addTeacher("ucka");
//		sa.addStudent("stu");
//		 System.out.print(sa.getTeachers());
//		save(sa);
		this.data = load();
	//	this.data
		}

	private static Data load() {
		Data data ;
		// TODO Auto-generated method stub
		try{
			FileInputStream fileIn = new FileInputStream("loginData.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			// load object from the file 
			data = (Data) in.readObject();
			System.out.print(data.getTeachers());
			fileIn.close();
			return(data);
		} catch(IOException e) {
			e.printStackTrace();
			data = new Data();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			data = new Data();
		}
		return data;
	}

	public static void setScene(FlowPane pane ) {
		Scene scene = new Scene(pane, 400, 300);
		stage.setScene(scene);
		stage.show();
	
	}
	private  FlowPane loguj(Data s, String text) {
		
	
		//Data
		User usr  =  s.getUser(text);
		
		return usr.gui(usr,s);
		
	}

	

//	private static void sprav(String text) {
//		// TODO Auto-generated method stub
//		if (Data.getUser(text)) {
//			// userNotFound
//		}else {
//			
//		}
//		
//	}
	

}
