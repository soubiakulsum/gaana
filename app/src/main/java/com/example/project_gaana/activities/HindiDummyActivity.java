package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_gaana.R;
import com.example.project_gaana.fragments.HindiPicksFragment;
import com.example.project_gaana.fragments.TopPicksFragment;

public class HindiDummyActivity extends AppCompatActivity {

    private ImageView ivPlaySong;
    private TextView tvAlbumName;

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_dummy);

        fragmentManager = getSupportFragmentManager();

        initViews();

        getDataFromIntent();


        HindiPicksFragment hindiPicksFragment = new HindiPicksFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fContainer, hindiPicksFragment, "Top").commit();


    }


        private void initViews() {
            ivPlaySong = findViewById(R.id.ivPlaySong);
            tvAlbumName = findViewById(R.id.tvAlbumName);
        }

        private void getDataFromIntent() {
            if (getIntent() != null && getIntent().getExtras() != null) {
                String data = getIntent().getStringExtra("songName");
                int image = getIntent().getIntExtra("image", 0);
                ivPlaySong.setImageResource(image);
                tvAlbumName.setText(data);

            }
        }

    }