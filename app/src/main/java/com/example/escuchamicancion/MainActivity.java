package com.example.escuchamicancion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAbout = findViewById(R.id.btn_about);
        Button btnGenres = findViewById(R.id.btn_genres);

        btnAbout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        });

        btnGenres.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, GenresActivity.class);
            startActivity(intent);
        });
    }
}
