package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        TextView songs = (TextView) findViewById(R.id.tv_songs);
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView playlist = (TextView) findViewById(R.id.tv_playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(ArtistsActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.tv_albums);
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(albumIntent);
            }
        });


        TextView payment = (TextView) findViewById(R.id.tv_payment);
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Payment View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(ArtistsActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
