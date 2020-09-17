package com.example.android.capstoneprojectsqlite;

// a object that can hold the username and password so is can be stored in the database
public class UserModel {

    private String username;
    private String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
