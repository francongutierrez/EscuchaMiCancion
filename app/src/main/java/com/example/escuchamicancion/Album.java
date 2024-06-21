package com.example.escuchamicancion;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class Album implements Parcelable {
    private String title;
    private ArrayList<String> songTitles;
    private ArrayList<Integer> songResIds;
    private String musician;
    private String genre;
    private String albumCover;
    private String tracklist;

    public Album(String title, ArrayList<String> songTitles, ArrayList<Integer> songResIds, String musician, String genre, String albumCover, String tracklist) {
        this.title = title;
        this.songTitles = songTitles;
        this.songResIds = songResIds;
        this.musician = musician;
        this.genre = genre;
        this.albumCover = albumCover;
        this.tracklist = tracklist;
    }

    protected Album(Parcel in) {
        title = in.readString();
        songTitles = in.createStringArrayList();
        songResIds = new ArrayList<>();
        in.readList(songResIds, Integer.class.getClassLoader());
        musician = in.readString();
        genre = in.readString();
    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getSongTitles() {
        return songTitles;
    }

    public void setSongTitles(ArrayList<String> songTitles) {
        this.songTitles = songTitles;
    }

    public ArrayList<Integer> getSongResIds() {
        return songResIds;
    }

    public void setSongResIds(ArrayList<Integer> songResIds) {
        this.songResIds = songResIds;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(String albumCover) {
        this.albumCover = albumCover;
    }

    public String getTracklist() {
        return tracklist;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeStringList(songTitles);
        dest.writeList(songResIds);
        dest.writeString(musician);
        dest.writeString(genre);
    }
}
