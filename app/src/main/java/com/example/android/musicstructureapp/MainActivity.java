package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Artist category
        Button artists = (Button) findViewById(R.id.artists);
        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists View is clicked on.
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the Songs category
        Button songs = (Button) findViewById(R.id.songs);
        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Songs View is clicked on.
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the Top 10 category
        Button topten = (Button) findViewById(R.id.top_ten);
        // Set a click listener on that View
        topten.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Top 10 View is clicked on.
            @Override
            public void onClick(View v) {
                Intent toptenIntent = new Intent(MainActivity.this, TopTenActivity.class);
                startActivity(toptenIntent);
            }
        });

        // Find the View that shows My Playlist category
        Button playlist = (Button) findViewById(R.id.playlist);
        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when My Playlist View is clicked on.
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, MyPlaylist.class);
                startActivity(playlistIntent);
            }
        });
    }
}
