package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.ToggleButton;

public class Age extends AppCompatActivity {

    RadioButton age1, age2, age3, age4, age5, age6, age7, age8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        age1 = (RadioButton) findViewById(R.id.age_age1);
        age2 = (RadioButton) findViewById(R.id.age_age2);
        age3 = (RadioButton) findViewById(R.id.age_age3);
        age4 = (RadioButton) findViewById(R.id.age_age4);
        age5 = (RadioButton) findViewById(R.id.age_age5);
        age6 = (RadioButton) findViewById(R.id.age_age6);
        age7 = (RadioButton) findViewById(R.id.age_age7);
        age8 = (RadioButton) findViewById(R.id.age_age8);

        age1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton is checked
                    age1.setBackground(getDrawable(R.drawable.radio_selected));
                    age1.setTextColor(getResources().getColor(R.color.white));
                } else {
                    // RadioButton is unchecked
                    age1.setBackground(getDrawable(R.drawable.radio_unselected));
                    age1.setTextColor(getResources().getColor(R.color.orange));
                }
            }
        });

        age2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton is checked
                    age2.setBackground(getDrawable(R.drawable.radio_selected));
                    age2.setTextColor(getColor(R.color.white));
                } else {
                    // RadioButton is unchecked
                    age2.setBackground(getDrawable(R.drawable.radio_unselected));
                    age2.setTextColor(getColor(R.color.orange));
                }
            }
        });


        age3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton is checked
                    age3.setBackground(getDrawable(R.drawable.radio_selected));
                    age3.setTextColor(getColor(R.color.white));
                } else {
                    // RadioButton is unchecked
                    age3.setBackground(getDrawable(R.drawable.radio_unselected));
                    age3.setTextColor(getColor(R.color.orange));
                }
            }
        });


        age4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton is checked
                    age4.setBackground(getDrawable(R.drawable.radio_selected));
                    age4.setTextColor(getColor(R.color.white));
                } else {
                    // RadioButton is unchecked
                    age4.setBackground(getDrawable(R.drawable.radio_unselected));
                    age4.setTextColor(getColor(R.color.orange));
                }
            }
        });


        age5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton is checked
                    age5.setBackground(getDrawable(R.drawable.radio_selected));
                    age5.setTextColor(getColor(R.color.white));
                } else {
                    // RadioButton is unchecked
                    age5.setBackground(getDrawable(R.drawable.radio_unselected));
                    age5.setTextColor(getColor(R.color.orange));
                }
            }
        });


        age6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton is checked
                    age6.setBackground(getDrawable(R.drawable.radio_selected));
                    age6.setTextColor(getColor(R.color.white));
                } else {
                    // RadioButton is unchecked
                    age6.setBackground(getDrawable(R.drawable.radio_unselected));
                    age6.setTextColor(getColor(R.color.orange));
                }
            }
        });


        age7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton is checked
                    age7.setBackground(getDrawable(R.drawable.radio_selected));
                    age7.setTextColor(getColor(R.color.white));
                } else {
                    // RadioButton is unchecked
                    age7.setBackground(getDrawable(R.drawable.radio_unselected));
                    age7.setTextColor(getColor(R.color.orange));
                }
            }
        });


        age8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton is checked
                    age8.setBackground(getDrawable(R.drawable.radio_selected));
                    age8.setTextColor(getColor(R.color.white));
                } else {
                    // RadioButton is unchecked
                    age2.setBackground(getDrawable(R.drawable.radio_unselected));
                    age2.setTextColor(getColor(R.color.orange));
                }
            }
        });




    }
}
