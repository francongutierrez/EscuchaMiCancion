package com.example.escuchamicancion;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class AlbumPagerAdapter extends FragmentStateAdapter {

    private List<Album> albumList;

    public AlbumPagerAdapter(@NonNull FragmentActivity fragmentActivity, List<Album> albumList) {
        super(fragmentActivity);
        this.albumList = albumList;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Album album = albumList.get(position);
        return AlbumDetailFragment.newInstance(album.getTitle());
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
