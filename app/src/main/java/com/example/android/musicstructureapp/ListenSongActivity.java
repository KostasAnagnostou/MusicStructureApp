package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class ListenSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_song);

       // Find the ImageView that shows the Play Icon
       final ImageView playIcon = (ImageView) findViewById(R.id.play_icon);
        // Set a click listener on that View
        playIcon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Play Icon View is clicked on.
            @Override
            public void onClick(View v) {
                playIcon.setImageResource(R.drawable.ic_pause_circle_filled_white_24dp);
            }
        });
    }

    // Setting up the App Bar Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // Responding to Actions on the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
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
