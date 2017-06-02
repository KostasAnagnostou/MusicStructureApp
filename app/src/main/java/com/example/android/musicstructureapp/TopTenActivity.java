package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class TopTenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_ten);

        // Find the ImageView that shows the 1st Song in activity_top_ten.xml
        ImageView songEminem = (ImageView) findViewById(R.id.eminem);
        // Set a click listener on that View
        songEminem.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the 1st ImageView in Top Songs is clicked on.
            @Override
            public void onClick(View v) {
                Intent eminemIntent = new Intent(TopTenActivity.this, ListenSongActivity.class);
                startActivity(eminemIntent);
            }
        });

        // Find the ImageView that shows the 2nd Song in activity_top_ten.xml
        ImageView songAlphaBlondy = (ImageView) findViewById(R.id.alpha_blondy);
        // Set a click listener on that View
        songAlphaBlondy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the 2nd ImageView in Top Songs is clicked on.
            @Override
            public void onClick(View v) {
                Intent alphaBlondyIntent = new Intent(TopTenActivity.this, ListenSongActivity.class);
                startActivity(alphaBlondyIntent);
            }
        });

        // Find the ImageView that shows the 3rd Song in activity_top_ten.xml
        ImageView songAdele = (ImageView) findViewById(R.id.adele);
        // Set a click listener on that View
        songAdele.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the 3rd ImageView in Top Songs is clicked on.
            @Override
            public void onClick(View v) {
                Intent adeleIntent = new Intent(TopTenActivity.this, ListenSongActivity.class);
                startActivity(adeleIntent);
            }
        });

        // Find the ImageView that shows the 4th Song in activity_top_ten.xml
        ImageView songMarley = (ImageView) findViewById(R.id.bob_marley);
        // Set a click listener on that View
        songMarley.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the 4th ImageView in Top Songs is clicked on.
            @Override
            public void onClick(View v) {
                Intent marleyIntent = new Intent(TopTenActivity.this, ListenSongActivity.class);
                startActivity(marleyIntent);
            }
        });

        // Find the ImageView that shows the 5th Song in activity_top_ten.xml
        ImageView songEminem1 = (ImageView) findViewById(R.id.eminem1);
        // Set a click listener on that View
        songEminem1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the 5th ImageView in Top Songs is clicked on.
            @Override
            public void onClick(View v) {
                Intent eminem1Intent = new Intent(TopTenActivity.this, ListenSongActivity.class);
                startActivity(eminem1Intent);
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
