package com.example.ice;

import java.util.ArrayList;
import java.util.List;

public class GameLogic {

    User currentUser;


    // Initializes game including the player and npc monsters/items.
    public void GameInit(User u, User npc) {

    }

    // Holds the this.user's datamon when carrying one single.
    // Initialized on game start.
    public Datamon userDatamon() {
        return null;
    }

    // Holds the this.user datamons when carrying several.
    // Initialized on game start.
    public List userCarriedDatamons() {
        List<Datamon> datamons = new ArrayList<>();
        return null;
    }

    // Holds this.users items.
    // Initialized on game start.
    public List userCarriedItems() {
        return null;
    }

    // Checks datamon health on user round end.
    // If this.user datamon's health is 0=<, other player wins game.
    public void checkGameWon(List datamons) {

    }




}
