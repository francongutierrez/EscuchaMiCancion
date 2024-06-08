package com.example.escuchamicancion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class MusiciansActivity extends AppCompatActivity {

    // Define listas de artistas para cada género
    private List<String> rockArtists = Arrays.asList("Artista Rock 1", "Artista Rock 2", "Artista Rock 3");
    private List<String> popArtists = Arrays.asList("Artista Pop 1", "Artista Pop 2", "Artista Pop 3");
    private List<String> jazzArtists = Arrays.asList("Artista Jazz 1", "Artista Jazz 2", "Artista Jazz 3");
    private List<String> classicalArtists = Arrays.asList("Artista Clásico 1", "Artista Clásico 2", "Artista Clásico 3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicians);

        String genre = getIntent().getStringExtra("genre");
        TextView tvGenre = findViewById(R.id.tv_genre);
        tvGenre.setText("Músicos de " + genre);

        // Obtén una referencia a los botones de artistas
        Button btnMusician1 = findViewById(R.id.btn_musician1);
        Button btnMusician2 = findViewById(R.id.btn_musician2);
        Button btnMusician3 = findViewById(R.id.btn_musician3);
        Button btnMusician4 = findViewById(R.id.btn_musician4);

        // Dependiendo del género seleccionado, actualiza los botones de artistas
        switch (genre) {
            case "Rock":
                updateArtistButtons(rockArtists, btnMusician1, btnMusician2, btnMusician3, btnMusician4);
                break;
            case "Pop":
                updateArtistButtons(popArtists, btnMusician1, btnMusician2, btnMusician3, btnMusician4);
                break;
            case "Jazz":
                updateArtistButtons(jazzArtists, btnMusician1, btnMusician2, btnMusician3, btnMusician4);
                break;
            case "Clásica":
                updateArtistButtons(classicalArtists, btnMusician1, btnMusician2, btnMusician3, btnMusician4);
                break;
        }
    }

    // Método para actualizar los botones de artistas según la lista proporcionada
    private void updateArtistButtons(List<String> artists, Button btn1, Button btn2, Button btn3, Button btn4) {
        if (artists.size() > 0) {
            btn1.setText(artists.get(0));
            btn1.setOnClickListener(view -> openAlbumsActivity(artists.get(0)));
        }
        if (artists.size() > 1) {
            btn2.setText(artists.get(1));
            btn2.setOnClickListener(view -> openAlbumsActivity(artists.get(1)));
        }
        if (artists.size() > 2) {
            btn3.setText(artists.get(2));
            btn3.setOnClickListener(view -> openAlbumsActivity(artists.get(2)));
        }
        if (artists.size() > 3) {
            btn4.setText(artists.get(3));
            btn4.setOnClickListener(view -> openAlbumsActivity(artists.get(3)));
        }
    }

    // Método para abrir la actividad AlbumsActivity con el nombre del artista seleccionado
    private void openAlbumsActivity(String artistName) {
        Intent intent = new Intent(MusiciansActivity.this, AlbumsActivity.class);
        intent.putExtra("musician", artistName);
        startActivity(intent);
    }
}
