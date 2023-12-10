package com.example.ice;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
public class SelectorController {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private ImageView Mon1, Mon2, Mon3, Mon4, Mon5, Mon6;
    @FXML
    private Button Select1, Select2, Select3, Select4, Select5, Select6;
    private final List<Datamon> datamons = new ArrayList<>();
    private User currentUser = new User("Magnus", "", datamons);

    //TODO: Fix assigned userObject.
    @FXML
    void initialize() {

    }

    // Assigns the player datamon(s) according to buttons pressed.
    // Returns list of datamons to the BattleSimController.
    public List<Datamon> giveUserDatamons(Datamon datamon) {
        datamons.add(datamon);

        return datamons;
    }


    @FXML
    private void Select1Pressed(ActionEvent event) {
        Datamon datamon = new Fred2();

        if(!datamons.contains(datamon.getName()) && datamons.size() < 6) {
            giveUserDatamons(datamon);
            System.out.println(datamon.getName() + " datamon added.");
        }
        System.out.println("Already contains datamon" + datamon.getName() + " object.");
    }

    @FXML
    private void  Select2Pressed(ActionEvent event) {
        Datamon datamon = new RouvisMor();

        if(!datamons.contains(datamon.getName()) && datamons.size() < 6) {
            giveUserDatamons(datamon);
            System.out.println(datamon.getName() + " datamon added.");
        }
        System.out.println("Already contains datamon" + datamon.getName() + " object.");
    }

    @FXML
    private void Select3Pressed(ActionEvent event) {
       Datamon datamon = new Jonas();

        if(!datamons.contains(datamon.getName()) && datamons.size() < 6) {
            giveUserDatamons(datamon);
            System.out.println(datamon.getName() + " datamon added.");
        }
        System.out.println("Already contains datamon" + datamon.getName() + " object.");
    }

    @FXML
    private void  Select4Pressed(ActionEvent event) {
        Datamon datamon = new Kevin();

        if(!datamons.contains(datamon.getName()) && datamons.size() < 6) {
            giveUserDatamons(datamon);
            System.out.println(datamon.getName() + " datamon added.");
        }
        System.out.println("Already contains datamon" + datamon.getName() + " object.");
    }

    @FXML
    private void Select5Pressed(ActionEvent event) {
        //TODO: Fix assigned datamon.
       Datamon datamon = new Fred2();

        if(!datamons.contains(datamon.getName()) && datamons.size() < 6) {
            giveUserDatamons(datamon);
            System.out.println(datamon.getName() + " datamon added.");
        }
        System.out.println("Already contains datamon" + datamon.getName() + " object.");
    }
    @FXML
    private void Select6Pressed(ActionEvent event) {
        //TODO: Fix assigned datamon.
        Datamon datamon = new Fred2();

        if(!datamons.contains(datamon.getName()) && datamons.size() < 6) {
            giveUserDatamons(datamon);
            System.out.println(datamon.getName() + " added.");
        }
        System.out.println("Already contains datamon" + datamon.getName() + " object.");
    }





}