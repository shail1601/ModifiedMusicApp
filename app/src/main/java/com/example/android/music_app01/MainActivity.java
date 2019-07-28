package com.example.android.music_app01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button genreHipHop = findViewById(R.id.genreHipHop);
        Button genreRock = findViewById(R.id.genreRock);
        Button genreDance = findViewById(R.id.genreDance);

        genreHipHop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //create an intent for Hip-Hop Activity...
                Intent hipHopIntent = new Intent(MainActivity.this, HipHopActivity.class);
                startActivity(hipHopIntent);
            }
        });

        genreRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create an intent for Rock Activity...
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);

            }
        });

        genreDance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create an intent for Dance Activity...
                Intent danceIntent = new Intent(MainActivity.this, DanceActivity.class);
                startActivity(danceIntent);
            }
        });
    }
}