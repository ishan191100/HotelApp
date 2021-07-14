package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import static com.example.hotel.R.layout.activity_main4;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main4);
        getSupportActionBar().hide();
    }
    public void onBackPressed(View v) {
        super.onBackPressed();
    }
}