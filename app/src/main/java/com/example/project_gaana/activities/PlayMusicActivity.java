package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project_gaana.R;

import java.io.IOException;

public class PlayMusicActivity extends AppCompatActivity {

    ImageView ivGetImage;

    private ImageView mButtonResume;
    private ImageView mButtonStop;

    ImageView ivPlay;
    private SeekBar mSeekBar;

    private TextView mPass;
    private TextView mDuration;
    private TextView mDue;

    private Context mContext;
    private Activity mActivity;
//    ItemClickListeners itemClickListeners;

    ImageView btnPlayMusic;

    ImageView btnPauseMusic;

    private MediaPlayer mPlayer;
    private Handler mHandler;
    private Runnable mRunnable;

    private TextView tvGetSongName;

    private TextView tvSingerName;

    int length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        mContext = getApplicationContext();
        mActivity = PlayMusicActivity.this;

        ivGetImage = findViewById(R.id.GetSongImage);
        mSeekBar = findViewById(R.id.seek_bar);
        mButtonResume = findViewById(R.id.btn_res);
        mButtonStop = findViewById(R.id.btn_stop);
        mPass = findViewById(R.id.tv_pass);
        mDuration = findViewById(R.id.tv_duration);
        mDue = findViewById(R.id.tv_due);
        tvGetSongName = findViewById(R.id.getSongName);
        btnPlayMusic = findViewById(R.id.btn_playmusic);
        btnPauseMusic = findViewById(R.id.btn_pausemusic);
        tvSingerName = findViewById(R.id.SingerName);


        ivGetImage.setImageResource(getIntent().getIntExtra("image", 0));

        tvGetSongName.setText(getIntent().getStringExtra("songName"));

        tvSingerName.setText(getIntent().getStringExtra("songName") + " by " + getIntent().getStringExtra("singerName"));
        tvSingerName.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tvSingerName.setSelected(true);


        String uri = (String) getIntent().getExtras().get("url");
        mHandler = new Handler();
        btnPlayMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btnPlayMusic.setVisibility(View.GONE);
                btnPauseMusic.setVisibility(View.VISIBLE);
                stopPlaying();
                String audioUrl = uri;
                mPlayer = new MediaPlayer();
                try {
                    mPlayer.setDataSource(audioUrl);
                    mPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mPlayer.start();
                Toast.makeText(v.getContext(), "Media Player is playing.", Toast.LENGTH_SHORT).show();

                getAudioStats();
                initializeSeekBar();

            }

        });

        btnPauseMusic.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                btnPauseMusic.setVisibility(View.GONE);
                btnPlayMusic.setVisibility(View.VISIBLE);


                mPlayer.pause();
                length = mPlayer.getCurrentPosition();
            }
        });

        mButtonResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mButtonResume.setVisibility(View.GONE);
                mButtonStop.setVisibility(View.VISIBLE);

                mPlayer.seekTo(length);
                mPlayer.start();
            }
        });

        mButtonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonStop.setVisibility(View.GONE);
                mButtonResume.setVisibility(View.VISIBLE);

                stopPlaying();
            }
        });
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (mPlayer != null && b) {
                    mPlayer.seekTo(i * 1000);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }



    protected void stopPlaying() {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
            mPlayer = null;
            Toast.makeText(mContext, "Stop playing.", Toast.LENGTH_SHORT).show();
            if (mHandler != null) {
                mHandler.removeCallbacks(mRunnable);
            }
        }
    }

    protected void getAudioStats() {
        int duration = mPlayer.getDuration() / 1000; // In milliseconds
        int due = (mPlayer.getDuration() - mPlayer.getCurrentPosition()) / 1000;
        int pass = duration - due;
        mPass.setText("" + pass + " seconds");
        mDuration.setText("" + duration + " seconds");
        mDue.setText("" + due + " seconds");
    }

    protected void initializeSeekBar() {
        mSeekBar.setMax(mPlayer.getDuration() / 1000);
        mRunnable = new Runnable() {
            @Override
            public void run() {
                if (mPlayer != null) {
                    int mCurrentPosition = mPlayer.getCurrentPosition() / 1000; // In milliseconds
                    mSeekBar.setProgress(mCurrentPosition);
                    getAudioStats();
                }
                mHandler.postDelayed(mRunnable, 1000);
            }
        };
        mHandler.postDelayed(mRunnable, 1000);
    }
}
