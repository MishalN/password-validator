package com.acme.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.*;

public class passwordValidator extends AppCompatActivity {
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_validator);
    }
    // Stage 3 of the assignment
    public void submit(View view){
        password = (EditText) findViewById(R.id.input);
        n=0;
        String password2 = password.getText().toString();
        stage1(password2);
        stage2(password2);
        TextView out = (TextView) findViewById(R.id.output);

       if (n<5){
            out.setText("Not Strong: "+n);
        }
        else out.setText("Strong password: "+n);
    }

    int n =0;

    // stage 1 of the assignment
    public void stage1 (String X) {
        // call a function to check the password length
        if (passwordLegnth8(X) == true) {
            n++;
        }
        // call a function to check the password is NOT "password"
        if (notPassword(X) == true) {
            n++;
        }
    }
    // stage 2 of the assignment
    public  void stage2 (String X) {
        // call a function to check if there is at least one upper case char
        if (upperCase(X) == true) {
            n++;
        }
        // call a function to check if there is at least one lower case char
        if (lowerCase(X) == true) {
            n++;
        }
        // call a function to check if there is at least one NUMBER char
        if (isNumber(X) == true) {
            n++;
        }
    }
    // boolean function to check the password length
    public static boolean passwordLegnth8 (String X){
            if (X.length() > 8) {
                return true;
            }
            return false;
        }
    // boolean function to check the password is NOT "password"
    public static boolean notPassword(String X){
            if (X.equalsIgnoreCase("PASSWORD")){
                return false;
            }
            return true;
        }

    // boolean function to check is at least one upper case char
    public static boolean upperCase (String X){
        for(int i=0;i<X.length();i++){
            if(Character.isUpperCase(X.charAt(i))){
                return true;
            }
        }
        return false;
    }
    // boolean function to check is at least one lower case case char
    public static boolean lowerCase(String X){
        for(int i=0;i<X.length();i++){
            if(Character.isLowerCase(X.charAt(i))){
                return true;
            }
        }
        return false;
    }
    // boolean function to check is at least one NUMBER char
    public static boolean isNumber(String X){
        for(int i=0;i<X.length();i++){
            if(Character.isDigit(X.charAt(i))){
                return true;
            }
        }
        return false;
    }



}
