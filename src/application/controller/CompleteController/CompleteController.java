package application.controller.CompleteController;



import application.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CompleteController {

	Stage primaryStage = new Stage();
	@FXML Button home;
	
	@FXML
	public void handle(ActionEvent event){
		home = (Button) event.getSource();
		
		if(home.getId().equals("home")){
			try{
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(CompleteController.class.getResource("/Start.fxml"));
				AnchorPane layout = (AnchorPane) loader.load();
				Scene scene = new Scene(layout);
				Main.stage.setScene(scene);
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
