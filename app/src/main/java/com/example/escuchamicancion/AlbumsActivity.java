package com.example.escuchamicancion;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.view.Gravity;

public class AlbumsActivity extends AppCompatActivity {

    private Map<String, List<String>> artistAlbumsMap = new HashMap<>();

    private List<Album> albums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        initializeArtistAlbumsMap();

        String genre = getIntent().getStringExtra("genre");
        String musician = getIntent().getStringExtra("musician");

        Log.d("AlbumDetailFragment", "Genre: " + genre + ", Artist: " + musician);
        TextView tvArtist = findViewById(R.id.tv_musician);
        tvArtist.setText("Discos de " + musician);

        albums = AlbumData.getAllAlbums();

        GridLayout gridLayoutAlbums = findViewById(R.id.grid_layout_albums);

        for (int i = 0; i < albums.size(); i++) {
            Album album = albums.get(i);

            if (album.getMusician().equals(musician)) {
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(getResources().getIdentifier(album.getAlbumCover(), "drawable", getPackageName()));

                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.width = getResources().getDimensionPixelSize(R.dimen.album_image_size);
                params.height = getResources().getDimensionPixelSize(R.dimen.album_image_size);
                params.columnSpec = GridLayout.spec(i % 2);
                params.rowSpec = GridLayout.spec(i / 2);
                imageView.setLayoutParams(params);

                gridLayoutAlbums.addView(imageView);

                TextView textView = new TextView(this);
                textView.setText(album.getTitle());
                textView.setLayoutParams(new GridLayout.LayoutParams(params));
                textView.setGravity(Gravity.CENTER);

                gridLayoutAlbums.addView(textView);

                final int position = i;
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openAlbumDetailsActivity(album.getTitle(), musician, genre, position);
                    }
                });
            }
        }

        Button btnGoHome = findViewById(R.id.btn_go_home);
        btnGoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnGoBack = findViewById(R.id.btn_back);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                if (intent != null) {
                    String genre = intent.getStringExtra("genre");
                    Intent returnIntent = new Intent(AlbumsActivity.this, MusiciansActivity.class);
                    returnIntent.putExtra("genre", genre);
                    startActivity(returnIntent);
                }
            }
        });
    }

    private void initializeArtistAlbumsMap() {
        // Rock
        artistAlbumsMap.put("AC/DC", Arrays.asList("Back in Black", "Highway to Hell", "Let There Be Rock", "Powerage"));
        artistAlbumsMap.put("Nirvana", Arrays.asList("Nevermind", "In Utero", "MTV Unplugged in New York", "Bleach"));
        artistAlbumsMap.put("Pink Floyd", Arrays.asList("The Dark Side of the Moon", "The Wall", "Wish You Were Here", "Animals"));
        artistAlbumsMap.put("The Beatles", Arrays.asList("Abbey Road", "Sgt. Pepper's Lonely Hearts Club Band", "Revolver", "The White Album"));

        // Pop
        artistAlbumsMap.put("Michael Jackson", Arrays.asList("Thriller", "Bad", "Dangerous", "Off the Wall"));
        artistAlbumsMap.put("Adele", Arrays.asList("25", "21", "19", "30"));
        artistAlbumsMap.put("Taylor Swift", Arrays.asList("1989", "Red", "Fearless", "Speak Now"));
        artistAlbumsMap.put("Madonna", Arrays.asList("Like a Prayer", "True Blue", "Ray of Light", "Confessions on a Dance Floor"));

        // Jazz
        artistAlbumsMap.put("Miles Davis", Arrays.asList("Kind of Blue", "Bitches Brew", "In a Silent Way", "Sketches of Spain"));
        artistAlbumsMap.put("Charles Mingus", Arrays.asList("Mingus Ah Um", "The Black Saint and the Sinner Lady", "Blues & Roots", "Mingus Dynasty"));
        artistAlbumsMap.put("Dave Brubeck", Arrays.asList("Time Out", "Time Further Out", "Brubeck Time", "Jazz Goes to College"));
        artistAlbumsMap.put("John Coltrane", Arrays.asList("A Love Supreme", "Giant Steps", "Blue Train", "My Favorite Things"));

        // Clasica
        artistAlbumsMap.put("Antonio Vivaldi", Arrays.asList("The Four Seasons", "Gloria", "L'estro armonico", "La Stravaganza"));
        artistAlbumsMap.put("Wolfgang Amadeus Mozart", Arrays.asList("Eine kleine Nachtmusik", "Symphony No. 40", "Piano Sonata No. 11", "Requiem"));
        artistAlbumsMap.put("Ludwig van Beethoven", Arrays.asList("Symphony No. 9", "Piano Sonata No. 14", "Symphony No. 5", "Violin Concerto"));
        artistAlbumsMap.put("Georges Bizet", Arrays.asList("Carmen Suite No. 1", "L'Arlésienne Suite No. 1", "Symphony in C", "Jeux d'enfants"));

    }

    private void openAlbumDetailsActivity(String albumName, String musician, String genre, int position) {
        Intent intent = new Intent(AlbumsActivity.this, AlbumDetailActivity.class);
        Album album = albums.get(position);
        intent.putExtra("album_title", albumName);
        intent.putExtra("musician", musician);
        intent.putExtra("genre", genre);
        startActivity(intent);
    }
}
