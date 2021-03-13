package com.example.project_gaana.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.project_gaana.R;
import com.example.project_gaana.adapter.HomeAdapter;
import com.example.project_gaana.fragments.BuzzExtended;
import com.example.project_gaana.fragments.BuzzFragment;
import com.example.project_gaana.fragments.FragmentListener;
import com.example.project_gaana.fragments.MusicFragment;
import com.google.android.material.tabs.TabLayout;



public class MainActivity extends AppCompatActivity implements FragmentListener {


    private ViewPager Pager;
    private TabLayout HomeTabLayout;
    private ImageButton mBTNSettings;
    private ImageView Mnavi3;
    private ImageView Mnavi4;
    private ImageView Mnavi2;
    private ImageView Mnavi1;
    private TextView naviText1;
    private TextView naviText2;
    private TextView naviText3;
    private TextView naviText4;
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
        naviText1 = findViewById(R.id.naviText1);
        naviText2 = findViewById(R.id.naviText2);
        naviText3 = findViewById(R.id.naviText3);
        naviText4 = findViewById(R.id.naviText4);
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
//                Mnavi1.setImageResource(R.drawable.ic_home_selected);
//                Mnavi2.setImageResource(R.drawable.ic_hotshots__4_);
//                Mnavi3.setImageResource(R.drawable.ic_flash_symbol);
//                Mnavi4.setImageResource(R.drawable.ic_headphones);
//                naviText1.setTextColor(Color.parseColor("000000"));
//                naviText3.setTextColor(Color.parseColor("CACFD2"));
//                naviText4.setTextColor(Color.parseColor("CACFD2"));
//                naviText2.setTextColor(Color.parseColor("CACFD2"));
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        Mnavi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mnavi1.setImageResource(R.drawable.ic_home);
                Mnavi2.setImageResource(R.drawable.ic_hotshots_selected);
                Mnavi3.setImageResource(R.drawable.ic_flash_symbol);
                Mnavi4.setImageResource(R.drawable.ic_headphones);
//                naviText1.setTextColor(Color.parseColor("CACFD2"));
//                naviText2.setTextColor(Color.parseColor("000000"));
//                naviText3.setTextColor(Color.parseColor("CACFD2"));
//                naviText4.setTextColor(Color.parseColor("CACFD2"));

                AddPodcast();
            }
        });
        Mnavi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddMusic();
                Mnavi1.setImageResource(R.drawable.ic_home);
                Mnavi2.setImageResource(R.drawable.ic_hotshots__4_);
                Mnavi3.setImageResource(R.drawable.ic_flash_symbol);
                Mnavi4.setImageResource(R.drawable.ic_music_selected__1_);
//                naviText1.setTextColor(Color.parseColor("CACFD2"));
//                naviText2.setTextColor(Color.parseColor("CACFD2"));
//                naviText3.setTextColor(Color.parseColor("000000"));
//                naviText4.setTextColor(Color.parseColor("CACFD2"));
                AddMusic();
            }
        });

        Mnavi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mnavi1.setImageResource(R.drawable.ic_home);
                Mnavi2.setImageResource(R.drawable.ic_hotshots__4_);
                Mnavi3.setImageResource(R.drawable.ic_buzz_select);
                Mnavi4.setImageResource(R.drawable.ic_headphones);

//                naviText1.setTextColor(Color.parseColor("CACFD2"));
//                naviText2.setTextColor(Color.parseColor("CACFD2"));
//                naviText3.setTextColor(Color.parseColor("CACFD2"));
//                naviText4.setTextColor(Color.parseColor("000000"));
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
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        PodcastFragment podcastFragment = new PodcastFragment();
//        fragmentTransaction.replace(R.id.fcContainer, podcastFragment, "Fragme3").commit();

        Intent intent = new Intent(MainActivity.this,HotshotsActivity.class);
        startActivity(intent);


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

}