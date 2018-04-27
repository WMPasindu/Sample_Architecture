package com.application.common.alliontechnologies.architecturedesignapp.viewmodel;

import android.databinding.BaseObservable;

import com.application.common.alliontechnologies.architecturedesignapp.R;
import com.application.common.alliontechnologies.architecturedesignapp.model.User;

public class UserModel extends BaseObservable{

    private String userName;
    private String password;
    private String userNameHint;
    private String passwordHint;

    public UserModel(User user) {

        this.userNameHint = user.userNameHint;
        this.passwordHint = user.passwordHint;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(R.id.etxt_userName);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.etxt_password);
    }

    public String getUserNameHint() {
        return userNameHint;
    }

    public void setUserNameHint(String userNameHint) {
        this.userNameHint = userNameHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
}
