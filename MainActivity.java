package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView all_songs = (TextView) findViewById(R.id.all_songs);

        // Set a click listener on that View
        all_songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(MainActivity.this,
                        AllSongsActivity.class);
                startActivity(allSongsIntent);
            }
        });

        TextView play_songs = (TextView) findViewById(R.id.play_now);

        // Set a click listener on that View
        play_songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playSongsIntent = new Intent(MainActivity.this,
                        PlaySongsActivity.class);
                startActivity(playSongsIntent);
            }
        });

    }
}
