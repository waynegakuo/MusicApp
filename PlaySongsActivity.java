package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaySongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_songs);



        TextView first = (TextView) findViewById(R.id.first);

        // Set a click listener on that View
        first.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent firstIntent = new Intent(PlaySongsActivity.this,
                        FirstTrackActivity.class);
                startActivity(firstIntent);
            }
        });

        TextView second = (TextView) findViewById(R.id.second);

        // Set a click listener on that View
        second.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent secondIntent = new Intent(PlaySongsActivity.this,
                        SecondTrackActivity.class);
                startActivity(secondIntent);
            }
        });

        TextView third = (TextView) findViewById(R.id.third);

        // Set a click listener on that View
        third.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(PlaySongsActivity.this,
                        ThirdTrackActivity.class);
                startActivity(thirdIntent);
            }
        });

        TextView fourth = (TextView) findViewById(R.id.fourth);

        // Set a click listener on that View
        fourth.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent fourthIntent = new Intent(PlaySongsActivity.this,
                        FourthTrackActivity.class);
                startActivity(fourthIntent);
            }
        });

        TextView fifth = (TextView) findViewById(R.id.fifth);

        // Set a click listener on that View
        fifth.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent fifthIntent = new Intent(PlaySongsActivity.this,
                        FifthTrackActivity.class);
                startActivity(fifthIntent);
            }
        });

        TextView sixth = (TextView) findViewById(R.id.sixth);

        // Set a click listener on that View
        sixth.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent sixthIntent = new Intent(PlaySongsActivity.this,
                        SixthTrackActivity.class);
                startActivity(sixthIntent);
            }
        });

    }
}
