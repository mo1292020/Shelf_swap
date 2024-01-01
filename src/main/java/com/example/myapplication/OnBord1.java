package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.button.MaterialButton;

public class OnBord1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_bord1);

        Button next = findViewById(R.id.onbord1_next);

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(OnBord1.this, OnBord2.class));
                finish();
            }
        });

        Button skip = findViewById(R.id.onbord1_skip);

        skip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("App", Context.MODE_PRIVATE);
                preferences.edit().putBoolean("firstRun", false).apply();
                startActivity(new Intent(OnBord1.this, SignUp.class));
                finish();
            }
        });

        RadioGroup radioGroup = findViewById(R.id.radio_group_splash);
        final String value = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radio = (RadioButton)findViewById(i);
                if(radio.getText().equals("onbord2")){
                    startActivity(new Intent(getApplicationContext(),OnBord2.class));
                    finish();
                }
                else if(radio.getText().equals("onbord3")){
                    startActivity(new Intent(getApplicationContext(),OnBord3.class));
                    finish();
                }

            }
        });



    }

}