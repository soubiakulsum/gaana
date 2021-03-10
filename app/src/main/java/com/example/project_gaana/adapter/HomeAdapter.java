package com.example.project_gaana.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.project_gaana.fragments.AllSongsFragment;
import com.example.project_gaana.fragments.EnglishFragment;
import com.example.project_gaana.fragments.NewSongsFragment;
import com.example.project_gaana.fragments.TopHitsFragment;

public class HomeAdapter extends FragmentStatePagerAdapter {

    public HomeAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return AllSongsFragment.newInstance();
            case 1:
                return TopHitsFragment.newInstance();
            case 2:
                return NewSongsFragment.newInstance();
            case 3:
                return EnglishFragment.newInstance();
        }

        return AllSongsFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String tabTitle = "";

        switch (position){
            case 0:
                tabTitle = "All";
                break;
            case 1:
                tabTitle = "Top Hits";
                break;
            case 3:
                tabTitle = "New Songs";
                break;
            case 4:
                tabTitle = "English";
                break;
            default:
                tabTitle = "English";
                break;

        }
        return tabTitle;
    }
}
