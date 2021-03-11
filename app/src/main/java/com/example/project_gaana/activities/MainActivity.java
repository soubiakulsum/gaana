package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.example.project_gaana.DataModel.TrendingEnglishSongModel;
import com.example.project_gaana.OnItemClicked;
import com.example.project_gaana.R;
import com.example.project_gaana.adapter.HomeAdapter;
import com.example.project_gaana.model.PopularEnglishModel;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity{

    private ViewPager Pager;
    private TabLayout HomeTabLayout;

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
    }



}