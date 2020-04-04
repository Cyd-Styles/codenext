package com.example.cydbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNonFictionActivity(View view) {
        Intent intentToOpenNonFictionActivity = new Intent(this, NonFictionActivity.class);
        startActivity(intentToOpenNonFictionActivity);
    }
    public void openFantasyActivity(View view) {
        Intent intentToOpenFantasyActivity = new Intent(this, FantasyActivity.class);
        startActivity(intentToOpenFantasyActivity);
    }
    public void openClassicsActivity(View view) {
        Intent intentToOpenClassicsActivity = new Intent(this, ClassicsActivity.class);
        startActivity(intentToOpenClassicsActivity);
    }
    public void openMysteryActivity(View view) {
        Intent intentToOpenMysteryActivity = new Intent(this, MysteryActivity.class);
        startActivity(intentToOpenMysteryActivity);
    }
    public void openRomanceActivity(View view) {
        Intent intentToOpenRomanceActivity = new Intent(this, RomanceActivity.class);
        startActivity(intentToOpenRomanceActivity);
    }
    public void openScienceFictionActivity(View view) {
        Intent intentToOpenScienceFictionActivity = new Intent(this, ScienceFictionActivity.class);
        startActivity(intentToOpenScienceFictionActivity);
    }
    public void openHistoricalFictionActivity(View view) {
        Intent intentToOpenHistoricalFictionActivity = new Intent(this, HistoricalFictionActivity.class);
        startActivity(intentToOpenHistoricalFictionActivity);
    }
}