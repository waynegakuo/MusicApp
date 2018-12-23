package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        ArrayList<Track> tracks = new ArrayList<Track>();
        //words.add("one");
        tracks.add(new Track("A Different Way", "DJ Snake ft. Lauv", R.drawable.different_way));
        tracks.add(new Track("Be Happy", "Putzgrilla ft. Kranium", R.drawable.be_happy));
        tracks.add(new Track("Blow that Smoke", "Major Lazer ft. Tove Lo",R.drawable.blow_smoke));
        tracks.add(new Track("Bra Fie", "Fuse ODG ft. Damian Marley", R.drawable.bra_fie));
        tracks.add(new Track("Jibebe", "Diamond Platinumz", R.drawable.jibebe));
        tracks.add(new Track("Let Me Live",
                "Major Lazer ft. Anne Marie x Mr. Eazi", R.drawable.let_me));
        tracks.add(new Track("Loyal", "Major Lazer ft. Kizz Daniel", R.drawable.loyal));
        tracks.add(new Track("Malaika", "Nyashinski", R.drawable.malaika));
        tracks.add(new Track("Taki Taki", "DJ Snake, Cardi B., Selena Gomez", R.drawable.taki_taki));
        tracks.add(new Track("Particula", "Major Lazer ft. DJ Maphorisa Jidenna, Ice Prince", R.drawable.par));

        //custom layout created anew for we want to pass two arraylists
        TrackAdapter tracksAdapter =
                new TrackAdapter(this, tracks);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(tracksAdapter);

    }
}
