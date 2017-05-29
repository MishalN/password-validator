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
    public void stage1 (String X) {

        if (passwordLegnth8(X) == true) {
            n++;
        }
        if (notPassword(X) == true) {
            n++;
        }
    }

    public  void stage2 (String X) {
        if (upperCase(X) == true) {
            n++;
        }
        if (lowerCase(X) == true) {
            n++;
        }
        if (isNumber(X) == true) {
            n++;
        }
    }

        public static boolean passwordLegnth8 (String X){
            if (X.length() > 8) {
                return true;
            }
            return false;
        }

        public static boolean notPassword(String X){
            if (X.equalsIgnoreCase("PASSWORD")){
                return false;
            }
            return true;
        }


    public static boolean upperCase (String X){
        for(int i=0;i<X.length();i++){
            if(Character.isUpperCase(X.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean lowerCase(String X){
        for(int i=0;i<X.length();i++){
            if(Character.isLowerCase(X.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean isNumber(String X){
        for(int i=0;i<X.length();i++){
            if(Character.isDigit(X.charAt(i))){
                return true;
            }
        }
        return false;
    }



}
