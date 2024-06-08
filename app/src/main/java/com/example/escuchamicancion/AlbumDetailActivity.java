package com.example.escuchamicancion;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AlbumDetailActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private boolean isPlaying1 = false;
    private boolean isPlaying2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);

        // Retrieve album title from intent
        String albumTitle = getIntent().getStringExtra("album");

        // Get all albums
        ArrayList<Album> albums = AlbumData.getAllAlbums();

        // Find the album by title
        Album selectedAlbum = null;
        for (Album album : albums) {
            if (album.getTitle().equals(albumTitle)) {
                selectedAlbum = album;
                break;
            }
        }

        // Display album details
        if (selectedAlbum != null) {
            TextView tvAlbumTitle = findViewById(R.id.tv_album_title);
            tvAlbumTitle.setText(selectedAlbum.getTitle());

            ArrayList<String> songTitles = selectedAlbum.getSongTitles();
            ArrayList<Integer> songResIds = selectedAlbum.getSongResIds();

            TextView tvSong1 = findViewById(R.id.tv_song1);
            TextView tvSong2 = findViewById(R.id.tv_song2);

            Button btnPlaySong1 = findViewById(R.id.btn_play_song1);
            Button btnPlaySong2 = findViewById(R.id.btn_play_song2);

            if (songTitles.size() > 1 && songResIds.size() > 1) {
                tvSong1.setText(songTitles.get(0));
                tvSong2.setText(songTitles.get(1));

                mediaPlayer1 = MediaPlayer.create(this, songResIds.get(0));
                mediaPlayer2 = MediaPlayer.create(this, songResIds.get(1));

                btnPlaySong1.setOnClickListener(view -> {
                    if (isPlaying1) {
                        mediaPlayer1.pause();
                        btnPlaySong1.setText("Reproducir");
                    } else {
                        mediaPlayer1.start();
                        btnPlaySong1.setText("Pausar");
                    }
                    isPlaying1 = !isPlaying1;
                });

                btnPlaySong2.setOnClickListener(view -> {
                    if (isPlaying2) {
                        mediaPlayer2.pause();
                        btnPlaySong2.setText("Reproducir");
                    } else {
                        mediaPlayer2.start();
                        btnPlaySong2.setText("Pausar");
                    }
                    isPlaying2 = !isPlaying2;
                });
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer1 != null) {
            mediaPlayer1.release();
            mediaPlayer1 = null;
        }
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            mediaPlayer2 = null;
        }
    }
}
