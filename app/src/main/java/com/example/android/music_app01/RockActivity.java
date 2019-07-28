package com.example.android.music_app01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        Button btnGenres = findViewById(R.id.btnGenres);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("FalloutBoy", "Mania"));
        songs.add(new Song("White Snake", "The Purple Tour"));
        songs.add(new Song("Defy", "of Mice and Men"));
        songs.add(new Song("Foo Fighters", "Concrete & Gold"));
        songs.add(new Song("Royal Blood", "How did we get so Dark"));
        songs.add(new Song("StarCrawler", "StarCrawler"));
        songs.add(new Song("Pink Floyd", "The Dark side of the Moon"));
        songs.add(new Song("Nirvana", "Nevermind"));
        songs.add(new Song("Linkin Park", "Hybrid Theory"));
        songs.add(new Song("AC/DC", "Back in Black"));

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

                Intent intent = new Intent(RockActivity.this, NowPlayingActivity.class);
                intent.putExtra("song", strDisease1Msg);
                startActivity(intent);
                finish();
            }
        });

        btnGenres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RockActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
