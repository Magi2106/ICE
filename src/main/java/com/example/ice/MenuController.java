package com.example.ice;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class MenuController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ExitButton;

    @FXML
    private Button ShrekButton;

    @FXML
    private Button Start1;

    @FXML
    private MediaView mediaView;

    private File file;
    
    private Menu menu;
    private Media media;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        file = new File("C:\\Users\\Gustav\\Desktop\\Ice\\ICE\\src\\main\\resources\\com\\example\\ice\\DataMonB.mp4");
        media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);

    }

}