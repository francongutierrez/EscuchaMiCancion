package com.example.escuchamicancion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlbumsActivity extends AppCompatActivity {

    // Define un HashMap para asociar los nombres de los artistas con sus listas de álbumes
    private Map<String, List<String>> artistAlbumsMap = new HashMap<>();

    // Dentro del método onCreate de AlbumsActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Inicializa el HashMap con los nombres de los artistas y sus listas de álbumes
        initializeArtistAlbumsMap();

        String artist = getIntent().getStringExtra("musician");
        TextView tvArtist = findViewById(R.id.tv_musician);
        tvArtist.setText("Discos de " + artist);

        // Obtén una referencia a los botones de discos
        Button btnAlbum1 = findViewById(R.id.btn_album1);
        Button btnAlbum2 = findViewById(R.id.btn_album2);
        Button btnAlbum3 = findViewById(R.id.btn_album3);
        Button btnAlbum4 = findViewById(R.id.btn_album4);

        // Dependiendo del artista seleccionado, actualiza los botones de discos
        updateAlbumButtons(artist, btnAlbum1, btnAlbum2, btnAlbum3, btnAlbum4);

        // Configurar el botón "Volver al inicio"
        Button btnGoHome = findViewById(R.id.btn_go_home);
        btnGoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    // Método para inicializar el HashMap con los nombres de los artistas y sus listas de álbumes
    private void initializeArtistAlbumsMap() {
        artistAlbumsMap.put("Artista Rock 1", Arrays.asList("Disco 1.1", "Disco 1.2", "Disco 1.3"));
        artistAlbumsMap.put("Artista Pop 1", Arrays.asList("Disco 2.1", "Disco 2.2", "Disco 2.3"));
        artistAlbumsMap.put("Artista Jazz 1", Arrays.asList("Disco 3.1", "Disco 3.2", "Disco 3.3"));
        artistAlbumsMap.put("Artista Clásico 1", Arrays.asList("Disco 4.1", "Disco 4.2", "Disco 4.3"));
        // Agrega más artistas y sus listas de álbumes según sea necesario
    }

    // Método para actualizar los botones de discos según el artista seleccionado
    private void updateAlbumButtons(String artist, Button btn1, Button btn2, Button btn3, Button btn4) {
        List<String> albums = artistAlbumsMap.get(artist);
        if (albums == null || albums.isEmpty()) {
            // Si no hay álbumes para el artista, oculta todos los botones de álbumes
            btn1.setVisibility(View.GONE);
            btn2.setVisibility(View.GONE);
            btn3.setVisibility(View.GONE);
            btn4.setVisibility(View.GONE);
            return;
        }

        // Si hay álbumes para el artista, actualiza los botones con los nombres de los álbumes
        btn1.setText(albums.get(0));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlbumDetailsActivity(albums.get(0));
            }
        });

        btn2.setVisibility(albums.size() > 1 ? View.VISIBLE : View.GONE);
        btn3.setVisibility(albums.size() > 2 ? View.VISIBLE : View.GONE);
        btn4.setVisibility(albums.size() > 3 ? View.VISIBLE : View.GONE);

        if (albums.size() > 1) {
            btn2.setText(albums.get(1));
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openAlbumDetailsActivity(albums.get(1));
                }
            });
        }

        if (albums.size() > 2) {
            btn3.setText(albums.get(2));
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openAlbumDetailsActivity(albums.get(2));
                }
            });
        }

        if (albums.size() > 3) {
            btn4.setText(albums.get(3));
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openAlbumDetailsActivity(albums.get(3));
                }
            });
        }
    }

    // Método para abrir la actividad AlbumDetailActivity con el nombre del álbum seleccionado
    private void openAlbumDetailsActivity(String albumName) {
        Intent intent = new Intent(AlbumsActivity.this, AlbumDetailActivity.class);
        intent.putExtra("album_title", albumName);
        startActivity(intent);
    }
}
