package com.application.common.alliontechnologies.architecturedesignapp.model;

public class User {

    private String userName;
    private String password;
    public String userNameHint;
    public String passwordHint;

    public User() {

    }

    public User(String userNameHint, String passwordHint) {
        this.userNameHint = userNameHint;
        this.passwordHint = passwordHint;
    }
}
