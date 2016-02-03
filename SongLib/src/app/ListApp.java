package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.ListController;

public class ListApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();   
	      loader.setLocation(
	         getClass().getResource("/view/List.fxml"));
	      AnchorPane root = (AnchorPane)loader.load();

	      ListController listController = 
	         loader.getController();
	      listController.start(primaryStage);

	      Scene scene = new Scene(root, 200, 300);
	      primaryStage.setScene(scene);
	      primaryStage.show(); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
