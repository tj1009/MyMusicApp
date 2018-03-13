package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        TextView songs = (TextView) findViewById(R.id.tv_songs);
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView playlist = (TextView) findViewById(R.id.tv_playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(AlbumsActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.tv_artists);
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        TextView payment = (TextView) findViewById(R.id.tv_payment);
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Payment View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(AlbumsActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
