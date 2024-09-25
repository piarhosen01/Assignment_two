package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private RadioButton radioButton;
    private RatingBar ratingBar;
    private SeekBar seekBar;
    private Switch switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.check_box);
        radioButton = findViewById(R.id.radio_button);
        ratingBar = findViewById(R.id.rating_bar);
        seekBar = findViewById(R.id.seek_bar);
        switchButton = findViewById(R.id.switch_button);
    }
}