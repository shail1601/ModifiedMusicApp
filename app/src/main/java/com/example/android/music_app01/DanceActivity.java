package com.example.android.music_app01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.android.music_app01.R;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        Button btnGenres = findViewById(R.id.btnGenres);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Selena Gomez", "Wolves"));
        songs.add(new Song("Marshmallow", "Silence"));
        songs.add(new Song("Afrojack/Guetta", "Dirty Sexy Money"));
        songs.add(new Song("Chain Smokers", "Closer"));
        songs.add(new Song("Justin Bieber", "Let Me Love You"));
        songs.add(new Song("Rihanna", "This is what we came for"));
        songs.add(new Song("Alan Walker", "Faded"));
        songs.add(new Song("Duke Dumont", "Real Life"));
        songs.add(new Song("Kygo", "Star Gazing"));
        songs.add(new Song("Black Eyed Peas", "Let\'s get it Started"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String singer1 = songs.get(position).getSinger();
                String song1 = songs.get(position).getSong();
                String strDisease1Format = getResources().getString(R.string.formatted_string);
                String strDisease1Msg = String.format(strDisease1Format, singer1, song1);

                Intent intent = new Intent(DanceActivity.this, NowPlayingActivity.class);
                intent.putExtra("song", strDisease1Msg);
                startActivity(intent);
                finish();
            }
        });
        btnGenres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DanceActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
