package com.example.escuchamicancion;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class MusiciansActivity extends AppCompatActivity {

    private List<String> rockArtists = Arrays.asList("AC/DC", "Nirvana", "Pink Floyd", "The Beatles");
    private List<String> popArtists = Arrays.asList("Michael Jackson", "Adele", "Taylor Swift", "Madonna");
    private List<String> jazzArtists = Arrays.asList("Miles Davis", "Charles Mingus", "Dave Brubeck", "John Coltrane");
    private List<String> classicalArtists = Arrays.asList("Antonio Vivaldi", "Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Georges Bizet");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicians);

        String genre = getIntent().getStringExtra("genre");
        TextView tvGenre = findViewById(R.id.tv_genre);
        tvGenre.setText("Músicos de " + genre);

        Button btnMusician1 = findViewById(R.id.btn_musician1);
        Button btnMusician2 = findViewById(R.id.btn_musician2);
        Button btnMusician3 = findViewById(R.id.btn_musician3);
        Button btnMusician4 = findViewById(R.id.btn_musician4);

        Button btnGoBack = findViewById(R.id.btn_back);
        btnGoBack.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                if (intent != null) {

                    Intent returnIntent = new Intent(MusiciansActivity.this, GenresActivity.class);
                    startActivity(returnIntent);
                }
            }
        });


        Button btnGoHome = findViewById(R.id.btn_go_home);
        btnGoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusiciansActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        switch (genre) {
            case "Rock":
                updateArtistButtons(rockArtists, btnMusician1, btnMusician2, btnMusician3, btnMusician4, genre);
                break;
            case "Pop":
                updateArtistButtons(popArtists, btnMusician1, btnMusician2, btnMusician3, btnMusician4, genre);
                break;
            case "Jazz":
                updateArtistButtons(jazzArtists, btnMusician1, btnMusician2, btnMusician3, btnMusician4, genre);
                break;
            case "Clásica":
                updateArtistButtons(classicalArtists, btnMusician1, btnMusician2, btnMusician3, btnMusician4, genre);
                break;
        }
    }

    private void updateArtistButtons(List<String> artists, Button btn1, Button btn2, Button btn3, Button btn4, String genre) {
        if (artists.size() > 0) {
            btn1.setText(artists.get(0));
            btn1.setOnClickListener(view -> openAlbumsActivity(artists.get(0), genre));
        }
        if (artists.size() > 1) {
            btn2.setText(artists.get(1));
            btn2.setOnClickListener(view -> openAlbumsActivity(artists.get(1), genre));
        }
        if (artists.size() > 2) {
            btn3.setText(artists.get(2));
            btn3.setOnClickListener(view -> openAlbumsActivity(artists.get(2), genre));
        }
        if (artists.size() > 3) {
            btn4.setText(artists.get(3));
            btn4.setOnClickListener(view -> openAlbumsActivity(artists.get(3), genre));
        }
    }

    private void openAlbumsActivity(String artistName, String genre) {
        Intent intent = new Intent(MusiciansActivity.this, AlbumsActivity.class);
        intent.putExtra("musician", artistName);
        intent.putExtra("genre", genre);
        startActivity(intent);
    }
}
