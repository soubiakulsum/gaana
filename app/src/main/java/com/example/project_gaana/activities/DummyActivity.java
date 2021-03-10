package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.project_gaana.R;
import com.example.project_gaana.fragments.TopPicksFragment;

public class DummyActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);

        fragmentManager=getSupportFragmentManager();
        fragmentManager=getSupportFragmentManager();

        TopPicksFragment topPicksFragment = new TopPicksFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.flContainer,topPicksFragment,"Top").commit();


    }
}