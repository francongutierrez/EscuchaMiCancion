package com.example.escuchamicancion;

import java.util.ArrayList;
import java.util.Arrays;

public class AlbumData {

    public static ArrayList<Album> getAllAlbums() {
        ArrayList<Album> albums = new ArrayList<>();

        String[][] albumDetails = {
//                {"Álbum 1", "Canción 1 del Álbum 1", "Canción 2 del Álbum 1", String.valueOf(R.raw.song1_album1), String.valueOf(R.raw.song2_album1), "Músico 1", "Rock"},
//                {"Álbum 2", "Canción 1 del Álbum 2", "Canción 2 del Álbum 2", String.valueOf(R.raw.song1_album2), String.valueOf(R.raw.song2_album2), "Músico 2", "Pop"},
                // Agrega el resto de los álbumes con sus respectivos músicos y géneros
        };

        for (String[] albumDetail : albumDetails) {
            String albumTitle = albumDetail[0];
            ArrayList<String> songTitles = new ArrayList<>(Arrays.asList(albumDetail).subList(1, 3));
            ArrayList<Integer> songResIds = new ArrayList<>();
            for (int i = 3; i < 5; i++) {
                songResIds.add(Integer.parseInt(albumDetail[i]));
            }
            String musician = albumDetail[5];
            String genre = albumDetail[6];
            Album album = new Album(albumTitle, songTitles, songResIds, musician, genre);
            albums.add(album);
        }

        return albums;
    }
}

