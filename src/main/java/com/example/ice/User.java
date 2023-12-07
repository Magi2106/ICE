package com.example.ice;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private int xp;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



    public User(String username, String password, int age, List<String> watchedMedia, List<String> savedMedia) {
        this.username = username;
        this.password = password;

    }
}
