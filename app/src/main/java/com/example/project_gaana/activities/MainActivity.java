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
import com.example.project_gaana.fragments.BuzzFragment;
import com.example.project_gaana.fragments.BuzzzFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager Pager;
    private TabLayout HomeTabLayout;
    private ImageButton mBTNSettings;
    private ImageView Mnavi3;
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
        fragmentManager = getSupportFragmentManager();

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

    private void AddBuzz() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BuzzFragment buzzFragment = new BuzzFragment();
        fragmentTransaction.add(R.id.fbContainer, buzzFragment, "Fragme").commit();
    }

    public class WrapContentHeightViewPager extends ViewPager {

        public WrapContentHeightViewPager(@NonNull Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);

            int height = 0;
            for (int i = 0; i < getChildCount(); i++) {
                View child = getChildAt(i);
                child.measure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
                int h = child.getMeasuredHeight();
                if (h > height) height = h;
            }
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}