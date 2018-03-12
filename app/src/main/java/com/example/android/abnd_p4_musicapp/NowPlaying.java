package com.example.android.abnd_p4_musicapp;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class NowPlaying extends AppCompatActivity {
    Chronometer timer;
    ImageButton stop;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        ImageButton note = (ImageButton) findViewById(R.id.note);
        ImageButton playstop = findViewById(R.id.playstop);
        stop = findViewById(R.id.playstop);
        timer = findViewById(R.id.timer);
        timer.setBase(SystemClock.elapsedRealtime());


        note.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songlist category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the song list.
                Intent noteIntent = new Intent(NowPlaying.this, songList.class);

                // Start the new activity
                startActivity(noteIntent);
            }
        });


        playstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.start();
                stop.setImageResource(R.drawable.stop);
            }
        });



    }
}