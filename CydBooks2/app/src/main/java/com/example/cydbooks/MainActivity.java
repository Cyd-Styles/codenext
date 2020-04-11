package com.example.cydbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.cydbooks.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
    }
    public void openFantasyActivity(View view) {
        Intent intentToOpenFantasyActivity = new Intent(this, FantasyActivity.class);
        startActivity(intentToOpenFantasyActivity);
    }
    public void openClassicsActivity(View view) {
        Intent intentToOpenClassicsActivity = new Intent(this, ClassicsActivity.class);
        startActivity(intentToOpenClassicsActivity);
    }
    public void openRomanceActivity(View view) {
        Intent intentToOpenRomanceActivity = new Intent(this, RomanceActivity.class);
        startActivity(intentToOpenRomanceActivity);
    }
}
