package com.example.android.abnd_p4_musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class songList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        Button backtonowplaying;
        backtonowplaying = findViewById(R.id.backtonowplaying);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Tarkan", "Kuzu Kuzu"));
        songs.add(new Song("Tarkan", "Şımarık"));
        songs.add(new Song("Tarkan", "Kış Güneşi"));
        songs.add(new Song("Tarkan", "Dudu"));
        songs.add(new Song("Tarkan", "Ayrılık Zor"));
        songs.add(new Song("Tarkan", "Öp"));
        songs.add(new Song("Tarkan", "Dilli Düdük"));
        songs.add(new Song("Tarkan", "Gülümse Kaderine"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        backtonowplaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nowPlaying = new Intent(songList.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowPlaying);
            }
        });
    }
}
