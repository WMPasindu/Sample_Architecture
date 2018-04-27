package com.application.common.alliontechnologies.architecturedesignapp.utils;

import android.util.Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean isEmailValid(String email){

        if(email.length() != 0) {
            Pattern pattern = Patterns.EMAIL_ADDRESS;
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }else{
            return false;
        }
    }

    public static boolean isPasswordValid(String password){

        if(password.length() != 0) {
            return password.length() >= 6;
        }else{
            return false;
        }
    }

}
