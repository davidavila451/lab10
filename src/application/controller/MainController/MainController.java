package application.controller.MainController;

import application.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

	Stage primaryStage = new Stage();
	@FXML Button start;
	
	@FXML
	public void handle(ActionEvent event){
		start = (Button) event.getSource();
		if(start.getId().equals("start")){
			try{
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainController.class.getResource("/Workout.fxml"));
				AnchorPane layout = (AnchorPane) loader.load();
				Scene scene = new Scene(layout);
				Main.stage.setScene(scene);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
}
