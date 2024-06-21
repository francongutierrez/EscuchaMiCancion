package com.example.escuchamicancion;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class AlbumDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);

        ViewPager2 viewPager = findViewById(R.id.view_pager);

        String albumTitle = getIntent().getStringExtra("album_title");
        String musician = getIntent().getStringExtra("musician");

        ArrayList<Album> allAlbums = AlbumData.getAllAlbums();
        ArrayList<Album> artistAlbums = new ArrayList<>();

        for (Album album : allAlbums) {
            if (album.getMusician().equals(musician)) {
                artistAlbums.add(album);
            }
        }

        AlbumPagerAdapter adapter = new AlbumPagerAdapter(this, artistAlbums);
        viewPager.setAdapter(adapter);

        for (int i = 0; i < artistAlbums.size(); i++) {
            if (artistAlbums.get(i).getTitle().equals(albumTitle)) {
                viewPager.setCurrentItem(i);
                break;
            }
        }
    }
}
