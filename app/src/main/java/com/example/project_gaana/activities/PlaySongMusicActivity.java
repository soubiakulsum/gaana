package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_gaana.MusicService;
import com.example.project_gaana.R;

public class PlaySongMusicActivity extends AppCompatActivity {

    private ImageView ivPlayingSong;
    private ImageButton iBtnPlayCurrentSong;
    private ImageButton iBtnPauseCurrentSong;
    private TextView tvNowPlayingSong;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song_music);
        initViews();
        getData();
        intent= new Intent(this, MusicService.class);
        intent.putExtra("data","Yes data Pass");
    }

    private void getData() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            String songName = getIntent().getStringExtra("songName");
            int Image = getIntent().getIntExtra("songImage",0);
            tvNowPlayingSong.setText(songName);
            ivPlayingSong.setImageResource(Image);
        }
    }

    private void initViews() {
        ivPlayingSong = findViewById(R.id.ivPlayingSong);
        iBtnPlayCurrentSong = findViewById(R.id.iBtnPlayCurrentSong);
        iBtnPauseCurrentSong = findViewById(R.id.iBtnPauseCurrentSong);
        tvNowPlayingSong = findViewById(R.id.tvNowPlayingSong);
        iBtnPlayCurrentSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iBtnPauseCurrentSong.setVisibility(View.VISIBLE);
                iBtnPlayCurrentSong.setVisibility(View.GONE);
                startService(intent);
            }
        });
        iBtnPauseCurrentSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iBtnPauseCurrentSong.setVisibility(View.GONE);
                iBtnPlayCurrentSong.setVisibility(View.VISIBLE);
                stopService(intent);
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}




