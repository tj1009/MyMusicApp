package com.example.android.mymusicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.android.mymusicapp.R.string.playlist;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);


        TextView playlist = (TextView) findViewById(R.id.tv_playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(SongsActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.tv_albums);
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(albumIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.tv_artists);
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        TextView payment = (TextView) findViewById(R.id.tv_payment);
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Payment View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(SongsActivity.this,PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
