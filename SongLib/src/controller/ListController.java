package controller;

import java.io.File;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ListController implements Initializable {
	@FXML         
	   ListView<String> listView;                

	   private ObservableList<String> obsList;              
	  
	   public void start(Stage mainStage) {                
	      // create an ObservableList 
	      // from an ArrayList              
	      obsList = FXCollections.observableArrayList(                               
	                 "Giants",                               
	                 "Patriots",                               
	                 "Panthers",
	                 "Broncos",
	                 "Lions",
	                 "49ers",
	                 "Jaguars");               
	      listView.setItems(obsList); 
	      
	      // select the first item
	      listView.getSelectionModel().select(0);

	      // set listener for the items
	      listView
	      .getSelectionModel()
	      .selectedItemProperty()
	      .addListener(
	    		  (obs, oldVal, newVal) -> 
	    		  showItemInputDialog(mainStage));

	   }

	   private void showItem(Stage mainStage) {                
		   Alert alert = 
				   new Alert(AlertType.INFORMATION);
		   alert.initOwner(mainStage);
		   alert.setTitle("List Item");
		   alert.setHeaderText(
				   "Selected list item properties");

		   String content = "Index: " + 
				   listView.getSelectionModel()
		   .getSelectedIndex() + 
		   "\nValue: " + 
		   listView.getSelectionModel()
		   .getSelectedItem();

		   alert.setContentText(content);
		   alert.showAndWait();
	   }
	   
	   private void showItemInputDialog(Stage mainStage) {                
		   String item = listView.getSelectionModel().getSelectedItem();
		   int index = listView.getSelectionModel().getSelectedIndex();

		   TextInputDialog dialog = new TextInputDialog(item);
		   dialog.initOwner(mainStage); dialog.setTitle("List Item");
		   dialog.setHeaderText("Selected Item (Index: " + index + ")");
		   dialog.setContentText("Enter name: ");

		   Optional<String> result = dialog.showAndWait();
		   if (result.isPresent()) { obsList.set(index, result.get()); }
	   }

	    @FXML
	    private ImageView imageView;

	    @Override
	    public void initialize(URL location, ResourceBundle resources) {
	        File file = new File("src/album.png");
	        Image image = new Image(file.toURI().toString());
	        imageView.setImage(image);
	    }
 
}