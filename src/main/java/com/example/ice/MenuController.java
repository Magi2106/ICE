package com.example.ice;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class MenuController implements Initializable{

    @FXML
    private MediaView MenuBackground;
    @FXML
    private Button loginButton, rebisterButton;
    @FXML
    private TextField usernameField, passwordField;
    @FXML
    private Button playButton, pauseButton, resetButton;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        file = new File("MediaFiles/DataMonA.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        MenuBackground.setMediaPlayer(mediaPlayer);

    }

     /*
    @FXML
    private void loginPressed(ActionEvent event) {
        try {
            currentUser = io.login(usernameField.getText(), passwordField.getText());

            if (currentUser != null) {
                Platform.runLater(() -> {

                    try {
                        ((Node)(event.getSource())).getScene().getWindow().hide();
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
                        Parent root = loader.load();
                        userChoices.setScene(new Scene(root));;
                        userChoices.show();

                    } catch (IOException e) {
                        showErrorDialog("Error1", "An error occurred while loading the next screen.");
                    }
                });

            } else {
                showErrorDialog("Error2", "An error occurred while loading the next screen.");
            }
        } catch (FileNotFoundException e) {
            showErrorDialog("Error3", "An unexpected error occured: " + e.getMessage());

        } catch (Exception e) {
            showErrorDialog("Error4", "An unexpected error occured: " + e.getMessage());
        }
    }  */



    public void PlayMenu(MouseEvent mouseEvent) {
        mediaPlayer.play();
        mediaPlayer.setRate(1.1);
        mediaPlayer.setVolume(0.5);

    }



}

