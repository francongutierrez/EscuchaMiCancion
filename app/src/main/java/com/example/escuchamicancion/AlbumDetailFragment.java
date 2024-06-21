package com.example.escuchamicancion;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.app.Activity;
import android.util.Log;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class AlbumDetailFragment extends Fragment {
    private static final String ARG_ALBUM_TITLE = "album_title";
    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private boolean isPlaying1 = false;
    private boolean isPlaying2 = false;

    public static AlbumDetailFragment newInstance(String albumTitle) {
        AlbumDetailFragment fragment = new AlbumDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_ALBUM_TITLE, albumTitle);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_album_detail, container, false);

        String albumTitle = getArguments().getString(ARG_ALBUM_TITLE);

        ArrayList<Album> albums = AlbumData.getAllAlbums();
        Album selectedAlbum = null;
        for (Album album : albums) {
            if (album.getTitle().equals(albumTitle)) {
                selectedAlbum = album;
                break;
            }
        }

        if (selectedAlbum != null) {
            TextView tvAlbumTitle = view.findViewById(R.id.tv_album_title);
            tvAlbumTitle.setText(selectedAlbum.getTitle());

            TextView tvTracklist = view.findViewById(R.id.tv_tracklist);
            tvTracklist.setText(selectedAlbum.getTracklist());

            ArrayList<String> songTitles = selectedAlbum.getSongTitles();
            ArrayList<Integer> songResIds = selectedAlbum.getSongResIds();

            TextView tvSong1 = view.findViewById(R.id.tv_song1);
            TextView tvSong2 = view.findViewById(R.id.tv_song2);

            Button btnPlaySong1 = view.findViewById(R.id.btn_play_song1);
            Button btnPlaySong2 = view.findViewById(R.id.btn_play_song2);

            ImageView ivAlbumCover = view.findViewById(R.id.iv_album_cover);
            int resourceId = getResources().getIdentifier(selectedAlbum.getAlbumCover(), "drawable", getActivity().getPackageName());
            ivAlbumCover.setImageResource(resourceId);

            if (songTitles.size() > 1 && songResIds.size() > 1) {
                tvSong1.setText(songTitles.get(0));
                tvSong2.setText(songTitles.get(1));

                mediaPlayer1 = MediaPlayer.create(getActivity(), songResIds.get(0));
                mediaPlayer2 = MediaPlayer.create(getActivity(), songResIds.get(1));

                btnPlaySong1.setOnClickListener(view1 -> {
                    if (isPlaying1) {
                        mediaPlayer1.pause();
                        btnPlaySong1.setText("Reproducir");
                    } else {
                        mediaPlayer1.start();
                        btnPlaySong1.setText("Pausar");
                    }
                    isPlaying1 = !isPlaying1;
                });

                btnPlaySong2.setOnClickListener(view1 -> {
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

            Button btnBack = view.findViewById(R.id.btn_back);
            btnBack.setOnClickListener(v -> getActivity().onBackPressed());

            Button btnBackToGenre = view.findViewById(R.id.btn_back_to_genre);
            btnBackToGenre.setOnClickListener(new View.OnClickListener()  {
                @Override
                public void onClick(View view) {
                    Activity activity = getActivity();
                    if (activity != null) {
                        Intent intent = activity.getIntent();
                        if (intent != null) {

                            String genre = intent.getStringExtra("genre");

                            Log.d("AlbumDetailFragment", "Genre: " + genre);

                            Intent returnIntent = new Intent(activity, MusiciansActivity.class);
                            returnIntent.putExtra("genre", genre);
                            startActivity(returnIntent);
                        }
                    }
                }
            });

            Button btnHome = view.findViewById(R.id.btn_home);
            btnHome.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                }
            });

            Button btnBackToAlbums = view.findViewById(R.id.btn_back);
            btnBackToAlbums.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Activity activity = getActivity();
                    if (activity != null) {
                        Intent intent = activity.getIntent();
                        if (intent != null) {
                            String genre = intent.getStringExtra("genre");
                            String musician = intent.getStringExtra("musician");

                            Intent returnIntent = new Intent(activity, AlbumsActivity.class);
                            returnIntent.putExtra("musician", musician);
                            returnIntent.putExtra("genre", genre);
                            startActivity(returnIntent);
                        }
                    }
                }
            });


        } else {
            TextView tvAlbumTitle = view.findViewById(R.id.tv_album_title);
            tvAlbumTitle.setText("Álbum no encontrado");
        }

        return view;
    }

    @Override
    public void onDestroy() {
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
