package com.example.ice;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class MenuController implements Initializable{

    @FXML
    private MediaView MenuBackground;

    @FXML
    private Button playButton, pauseButton, resetButton;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        file = new File("C:\\Users\\Gustav\\Desktop\\Ice\\ICE\\src\\main\\resources\\com\\example\\ice\\DataMonB.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        MenuBackground.setMediaPlayer(mediaPlayer);

    }



    public void PlayMenu(MouseEvent mouseEvent) {


        mediaPlayer.play();
        mediaPlayer.setRate(1.1);
        mediaPlayer.setVolume(0.5);

    }

}

