package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the View that shows the 1st Song (1st CardView) in activity_songs.xml
        CardView card = (CardView) findViewById(R.id.card_view_song);
        // Set a click listener on that View
        card.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the 1st CardView is clicked on.
            @Override
            public void onClick(View v) {
                Intent listenIntent = new Intent(SongsActivity.this, ListenSongActivity.class);
                startActivity(listenIntent);
            }
        });

        // Find the View that shows the 2nd Song (2nd CardView) in activity_songs.xml
        CardView card1 = (CardView) findViewById(R.id.card_view_song1);
        // Set a click listener on that View
        card1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the 2nd CardView is clicked on.
            @Override
            public void onClick(View v) {
                Intent listenIntent = new Intent(SongsActivity.this, ListenSongActivity.class);
                startActivity(listenIntent);
            }
        });

        // Find the View that shows the 3rd Song (3rd CardView) in activity_songs.xml
        CardView card2 = (CardView) findViewById(R.id.card_view_song2);
        // Set a click listener on that View
        card2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the 3rd CardView is clicked on.
            @Override
            public void onClick(View v) {
                Intent listenIntent = new Intent(SongsActivity.this, ListenSongActivity.class);
                startActivity(listenIntent);
            }
        });

        // Find the View that shows the 4th Song (4th CardView) in activity_songs.xml
        CardView card3 = (CardView) findViewById(R.id.card_view_song3);
        // Set a click listener on that View
        card3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the 4th CardView is clicked on.
            @Override
            public void onClick(View v) {
                Intent listenIntent = new Intent(SongsActivity.this, ListenSongActivity.class);
                startActivity(listenIntent);
            }
        });
    }

    // Setting up the App Bar Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // Responding to Actions on the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                // User chose the "Home" item, show the app Home UI...
                Intent homeIntent = new Intent(this, MainActivity.class);
                startActivity(homeIntent);
                return true;
            case R.id.action_artists:
                // User chose the "Artists" item, show the app artists UI...
                Intent artistsIntent = new Intent(this, ArtistsActivity.class);
                startActivity(artistsIntent);
                return true;
            case R.id.action_songs:
                // User chose the "Songs" item, show the app songs UI...
                Intent songsIntent = new Intent(this, SongsActivity.class);
                startActivity(songsIntent);
                return true;
            case R.id.action_topten:
                // User chose the "Top 10" item, show the app top 10 UI...
                Intent topTenIntent = new Intent(this, TopTenActivity.class);
                startActivity(topTenIntent);
                return true;
            case R.id.action_playlist:
                // User chose the "My Playlist" item, show the app my playlist UI...
                Intent playListIntent = new Intent(this, MyPlaylist.class);
                startActivity(playListIntent);
                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }
}
