package com.example.ice;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private int xp;
    private int level;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



    public User(String username, String password, int xp, int level) {
        this.username = username;
        this.password = password;
        this.xp = xp;
        this.level = level;
    }
}
