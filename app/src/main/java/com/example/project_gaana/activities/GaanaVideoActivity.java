package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.project_gaana.DataModel.videoModel;
import com.example.project_gaana.R;

public class GaanaVideoActivity extends AppCompatActivity {

    VideoView VvGaanaVideo;

    TextView tvVideoName;

    TextView tvSingerVideoName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaana_video);

        VvGaanaVideo = findViewById(R.id.GaanaVideoView);


        tvVideoName=findViewById(R.id.VideoName);

        tvSingerVideoName=findViewById(R.id.SingerVideoName);

       Bundle bundle = getIntent().getExtras();

       String url = bundle.getString("videoUrl");

       String VideoName = bundle.getString("tvVideoName");


       String SingerName = bundle.getString("singerName");

       tvSingerVideoName.setText(" # " +VideoName +" By # " + SingerName);

       tvVideoName.setText(VideoName);

       VvGaanaVideo.setVideoPath(url);

       //xyz




        VvGaanaVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.start();

            }
        });

        VvGaanaVideo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.start();

            }
        });

    }

}