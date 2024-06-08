package com.example.escuchamicancion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class GenresActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        Button btnGenre1 = findViewById(R.id.btn_genre1);
        Button btnGenre2 = findViewById(R.id.btn_genre2);
        Button btnGenre3 = findViewById(R.id.btn_genre3);
        Button btnGenre4 = findViewById(R.id.btn_genre4);

        btnGenre1.setOnClickListener(view -> {
            Intent intent = new Intent(GenresActivity.this, MusiciansActivity.class);
            intent.putExtra("genre", "Rock");
            startActivity(intent);
        });

        btnGenre2.setOnClickListener(view -> {
            Intent intent = new Intent(GenresActivity.this, MusiciansActivity.class);
            intent.putExtra("genre", "Pop");
            startActivity(intent);
        });

        btnGenre3.setOnClickListener(view -> {
            Intent intent = new Intent(GenresActivity.this, MusiciansActivity.class);
            intent.putExtra("genre", "Jazz");
            startActivity(intent);
        });

        btnGenre4.setOnClickListener(view -> {
            Intent intent = new Intent(GenresActivity.this, MusiciansActivity.class);
            intent.putExtra("genre", "Clásica");
            startActivity(intent);
        });
    }
}
