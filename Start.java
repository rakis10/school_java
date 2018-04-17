package pro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Start extends Application{
	static Stage hlavneOkn;
	
	@Override
	public void start(Stage hlavneOkno) throws Exception {
		hlavneOkn = hlavneOkno;
//		// TODO Auto-generated method stub
//		FlowPane pane = new FlowPane();
//		Button btn = new Button();
//		TextField tf = new TextField("ucka");
//		pane.getChildren().add(btn);	
//		pane.getChildren().add(tf);		
//	//	setScene(pane, hlavneOkno);
//	//	btn.setOnAction(e->setScene(loguj(tf.getText())));
//		Scene scene = new Scene(pane, 400, 300);
//		setScene(pane, hlavneOkno);
//		//hlavneOkno.setScene(scene);
//		hlavneOkno.show();
//		
		Generate g = new Generate();
		g.login(hlavneOkno);
		
		
	}
	
	public static void setScene(FlowPane pane, Stage hlavneOkno2 ) {
		Scene scene = new Scene(pane, 400, 300);
		hlavneOkno2.setScene(scene);
	
	}
	public static void pop () {
		//setScene(new FlowPane(), hlavneOkn);
		Generate g = new Generate();
		g.login(hlavneOkn);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
