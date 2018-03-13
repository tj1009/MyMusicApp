package com.example.android.mymusicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.mymusicapp.R.string.songs;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        TextView songs = (TextView) findViewById(R.id.tv_songs);
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(PlaylistActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.tv_albums);
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(PlaylistActivity.this, AlbumsActivity.class);
                startActivity(albumIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.tv_artists);
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(PlaylistActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        TextView payment = (TextView) findViewById(R.id.tv_payment);
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Payment View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(PlaylistActivity.this,PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
