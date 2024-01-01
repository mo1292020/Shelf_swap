package com.example.myapplication;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // Get value from shared preferences,
        SharedPreferences preferences = getSharedPreferences("App", Context.MODE_PRIVATE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // if null (app is run first time) the default value (second argument) is returned
                boolean isFIrstRun = preferences.getBoolean("firstRun", true);
                if (isFIrstRun) {
                    // set isFirstRun to false
                    startActivity(new Intent(SplashScreen.this, OnBord1.class));
                    finish();
                }
                else{
                    startActivity(new Intent(SplashScreen.this, SignUp.class));
                    finish();
                }
            }
        },1500);


    }
}
