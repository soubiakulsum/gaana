package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_gaana.R;
import com.example.project_gaana.fragments.TopPicksFragment;

public class DummyActivity extends AppCompatActivity {

    private ImageView ivPlaySong;
    private TextView tvAlbumName;

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);
        initViews();
        fragmentManager = getSupportFragmentManager();
        fragmentManager = getSupportFragmentManager();

        TopPicksFragment topPicksFragment = new TopPicksFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.flContainer, topPicksFragment, "Top").commit();

        getDataFromIntent();
//        getHindiSongsData();

    }

//    private void getHindiSongsData() {
//        if (getIntent() != null && getIntent().getExtras() != null) {
//            String hindidata = getIntent().getStringExtra("hindialbum");
//            int hindiimage = getIntent().getIntExtra("hindiname", 0);
//            ivPlaySong.setImageResource(hindiimage);
//            tvAlbumName.setText(hindidata);
//        }
//    }

    private void initViews() {
        ivPlaySong = findViewById(R.id.ivPlaySong);
        tvAlbumName = findViewById(R.id.tvAlbumName);
    }

    private void getDataFromIntent() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            String data = getIntent().getStringExtra("name");
            int image = getIntent().getIntExtra("album", 0);
            ivPlaySong.setImageResource(image);
            tvAlbumName.setText(data);

        }
    }
}