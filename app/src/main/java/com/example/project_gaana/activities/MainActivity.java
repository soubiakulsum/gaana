package com.example.project_gaana.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.project_gaana.R;
import com.example.project_gaana.adapter.HomeAdapter;
import com.example.project_gaana.fragments.BuzzExtended;
import com.example.project_gaana.fragments.BuzzFragment;
import com.example.project_gaana.fragments.FragmentListener;
import com.example.project_gaana.fragments.MusicFragment;
import com.example.project_gaana.fragments.PodcastFragment;
import com.google.android.material.tabs.TabLayout;



public class MainActivity extends AppCompatActivity implements FragmentListener {


    private ViewPager Pager;
    private TabLayout HomeTabLayout;
    private ImageButton mBTNSettings;
    private ImageView Mnavi3;
    private ImageView Mnavi4;
    private ImageView Mnavi2;
    private ImageView Mnavi1;
    private ImageButton btnSearch;

    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setViewPagerAdapter();

    }

    private void setViewPagerAdapter() {
        HomeAdapter homeAdapter = new HomeAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        Pager.setAdapter(homeAdapter);
        HomeTabLayout.setupWithViewPager(Pager);


    }

    private void initViews() {
        Pager = findViewById(R.id.Pager);
        HomeTabLayout = findViewById(R.id.HomeTabLayout);
        mBTNSettings = findViewById(R.id.btnSettings);
        Mnavi3 = findViewById(R.id.navi3);
        Mnavi4 = findViewById(R.id.navi4);
        Mnavi2 = findViewById(R.id.navi2);
        Mnavi1 = findViewById(R.id.navi1);
        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchSongActivity.class);
                startActivity(intent);
            }
        });


        fragmentManager = getSupportFragmentManager();

        Mnavi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        Mnavi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddPodcast();
            }
        });
        Mnavi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddMusic();
            }
        });

        Mnavi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddBuzz();
            }
        });

        mBTNSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void AddPodcast() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PodcastFragment podcastFragment = new PodcastFragment();
        fragmentTransaction.replace(R.id.fcContainer, podcastFragment, "Fragme3").commit();


    }

    private void AddMusic() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MusicFragment musicFragment = new MusicFragment();
        fragmentTransaction.replace(R.id.fcContainer, musicFragment, "Fragme2").commit();

    }

    private void AddBuzz() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BuzzFragment buzzFragment = new BuzzFragment();
        fragmentTransaction.replace(R.id.fcContainer, buzzFragment, "Fragme").commit();
    }

    @Override
    public void launchBuzzExtendedFragment(Bundle bundle) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BuzzExtended buzzExtended = new BuzzExtended();
        buzzExtended.setArguments(bundle);
        fragmentTransaction.replace(R.id.fcContainer, buzzExtended, "buzzExtended").
                addToBackStack("buzzz").commit();





  

}