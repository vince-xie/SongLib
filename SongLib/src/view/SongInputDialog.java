package view;

import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SongInputDialog extends Dialog {

    private ButtonType ok = new ButtonType("Ok", ButtonData.OK_DONE);
    private ButtonType cancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
    private TextField songtext;
    private TextField artisttext;
    private TextField albumtext;
    private TextField yeartext;

    public SongInputDialog(String title) {
        setTitle(title);
        setHeaderText(null);

        GridPane dPane = new GridPane();
        Label song = new Label("Song: ");
        Label artist = new Label("Artist: ");
        Label album = new Label("Album: ");
        Label year = new Label("Year: ");
        songtext = new TextField();
        artisttext = new TextField();
        albumtext = new TextField();
        yeartext = new TextField();
        dPane.setHgap(7D);
        dPane.setVgap(8D);

        GridPane.setConstraints(song, 0, 0);
        GridPane.setConstraints(artist, 0, 1);
        GridPane.setConstraints(album, 0, 2);
        GridPane.setConstraints(year, 0, 3);
        GridPane.setConstraints(songtext, 1, 0);
        GridPane.setConstraints(artisttext, 1, 1);
        GridPane.setConstraints(albumtext, 1, 2);
        GridPane.setConstraints(yeartext, 1, 3);

        dPane.getChildren().addAll(song, artist, album, year, songtext, artisttext, albumtext, yeartext);
        getDialogPane().getButtonTypes().addAll(ok, cancel);
        getDialogPane().setContent(dPane);
    }
    
    public String getSongText() {
    	return songtext.getText();
    }
    
    public String getArtistText() {
    	return artisttext.getText();
    }
    
    public String getAlbumText() {
    	return albumtext.getText();
    }
    
    public String getYearText() {
    	return yeartext.getText();
    }
}