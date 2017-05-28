package com.acme.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.*;

public class passwordValidator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_validator);
    }

    String X = "";

    public static  int stage1 (String X) {

        int n =0;

        if (passwordLegnth8(X) == true) {
            n++;
        }
        if (notPassword(X) == true) {
            n++;
        }
        if (n>2) {String Y = "Strong PassWord";}

        String Y = "Weak Password";

        return n;

    }


        public static boolean passwordLegnth8 (String X){
            if (X.length() < 8) {
                return false;
            }
            return true;
        }

        public static boolean notPassword(String X){
            if (X.equalsIgnoreCase("PASSWORD")){
                return false;
            }
            return true;
        }






}
