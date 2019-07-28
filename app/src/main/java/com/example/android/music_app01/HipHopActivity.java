package com.example.android.music_app01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        Button btnGenres = findViewById(R.id.btnGenres);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("2pac", "Hit em up"));
        songs.add(new Song("Warren G", "Regulate"));
        songs.add(new Song("50 cent", "21 Questions"));
        songs.add(new Song("Nas", "Get Down"));
        songs.add(new Song("French Montana", "Unforgettable"));
        songs.add(new Song("Game", "This is how we do"));
        songs.add(new Song("Kanye West", "Jesus walks"));
        songs.add(new Song("Jay-Z", "Encore"));
        songs.add(new Song("Travis Scott", "Antidote"));
        songs.add(new Song("Young Thug", "Pick Up the Phone"));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String singer1 = songs.get(position).getSinger();
                String song1 = songs.get(position).getSong();
                String strDisease1Format = getResources().getString(R.string.formatted_string);
                String strDisease1Msg = String.format(strDisease1Format, singer1, song1);

                Intent intent = new Intent(HipHopActivity.this, NowPlayingActivity.class);
                intent.putExtra("song", strDisease1Msg);
                startActivity(intent);
                finish();
            }
        });

        btnGenres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HipHopActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
