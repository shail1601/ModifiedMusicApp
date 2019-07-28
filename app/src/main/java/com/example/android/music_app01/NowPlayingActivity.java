package com.example.android.music_app01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    Button playBtn, buttonGenres;
    ImageButton rwd, fwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        playBtn = findViewById(R.id.playBtn);
        rwd = findViewById(R.id.rwd);
        fwd = findViewById(R.id.fwd);
        buttonGenres = findViewById(R.id.buttonGenres);

        buttonGenres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "PLAY", Toast.LENGTH_SHORT).show();
            }
        });
        rwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Rewind", Toast.LENGTH_SHORT).show();
            }
        });
        fwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Fast forward", Toast.LENGTH_SHORT).show();
            }
        });
        Intent i = getIntent();
        String txt = i.getStringExtra("song");
        TextView singerPlaying = findViewById(R.id.singerPlaying);
        singerPlaying.setText(txt);
    }
}
