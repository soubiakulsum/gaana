package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.project_gaana.R;

public class SettingsActivity extends AppCompatActivity {
    private Button mBTNHOme;

    private RelativeLayout mHotShotRelativeLayout;
    private RelativeLayout mCardCoinBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);



        mBTNHOme = findViewById(R.id.btnHome);
        mHotShotRelativeLayout = findViewById(R.id.rlHotsShots);
        mCardCoinBalance = findViewById(R.id.CardCoinBalance);
//
//        mCardCoinBalance.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SettingsActivity.this, coinBalance.class);
//                startActivity(intent);
//            }
//        });
//        mBTNHOme.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SettingsActivity.this, HomeActivity.class);
//                startActivity(intent);
//            }
//        });

        mHotShotRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, MyHotShots.class);
                startActivity(intent);
            }
        });
    }
}