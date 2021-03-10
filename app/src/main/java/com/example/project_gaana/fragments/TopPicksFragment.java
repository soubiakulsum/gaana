package com.example.project_gaana.fragments;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.DataModel.TrendingEnglishSongModel;
import com.example.project_gaana.ItemClickListeners;
import com.example.project_gaana.R;
import com.example.project_gaana.adapter.TrendingEnglishAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TopPicksFragment extends Fragment implements ItemClickListeners {

    RecyclerView mRecyclerView;

    List<TrendingEnglishSongModel> trendingEnglishSongModels = new ArrayList<>();

    TrendingEnglishAdapter trendingEnglishAdapter;

    private Context mContext;
    private Fragment mActivity;

    private ImageView mButtonPlay;
    private ImageView mButtonPause;
    private Button mButtonResume;
    private Button mButtonStop;

    private SeekBar mSeekBar;

    private TextView mPass;
    private TextView mDuration;
    private TextView mDue;

    private MediaPlayer mPlayer;
    private Handler mHandler;
    private Runnable mRunnable;

    int length ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_picks, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = view.findViewById(R.id.RecyclerView);

        buildData();

        SetRecyclerAdapter();


        mContext = getContext();
        mActivity = TopPicksFragment.this;
        mButtonPlay = view.findViewById(R.id.btn_play);
        mButtonPause = view.findViewById(R.id.btn_pause);
        mButtonResume = view.findViewById(R.id.btn_res);
        mButtonStop = view.findViewById(R.id.btn_stop);
        mSeekBar = view.findViewById(R.id.seek_bar);
        mPass = view.findViewById(R.id.tv_pass);
        mDuration = view.findViewById(R.id.tv_duration);
        mDue = view.findViewById(R.id.tv_due);
        mHandler = new Handler();

        mButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             //   stopPlaying();

                mButtonPlay.setVisibility(View.GONE);
                mButtonPause.setVisibility(View.VISIBLE);

                String audioUrl = "";
                mPlayer = new MediaPlayer();
                try {
                    mPlayer.setDataSource(audioUrl);
                    mPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mPlayer.start();
                Toast.makeText(mContext,"Media Player is playing.",Toast.LENGTH_SHORT).show();
                getAudioStats();
                initializeSeekBar();
            }
        });

       mButtonPause.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                mButtonPause.setVisibility(View.GONE);
                mButtonPlay.setVisibility(View.VISIBLE);


                mPlayer.pause();
                length = mPlayer.getCurrentPosition();
            }
        });

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(mPlayer!=null && b){
                    mPlayer.seekTo(i*1000);
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

    protected void getAudioStats(){
        int duration  = mPlayer.getDuration()/1000; // In milliseconds
        int due = (mPlayer.getDuration() - mPlayer.getCurrentPosition())/1000;
        int pass = duration - due;
        mPass.setText("" + pass + " seconds");
        mDuration.setText("" + duration + " seconds");
        mDue.setText("" + due + " seconds");
    }

    protected void initializeSeekBar(){
        mSeekBar.setMax(mPlayer.getDuration()/1000);
        mRunnable = new Runnable() {
            @Override
            public void run() {
                if(mPlayer!=null){
                    int mCurrentPosition = mPlayer.getCurrentPosition()/1000; // In milliseconds
                    mSeekBar.setProgress(mCurrentPosition);
                    getAudioStats();
                }
                mHandler.postDelayed(mRunnable,1000);
            }
        };
        mHandler.postDelayed(mRunnable,1000);
    }


    private void SetRecyclerAdapter() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        trendingEnglishAdapter=new TrendingEnglishAdapter(trendingEnglishSongModels,this);
        mRecyclerView.setAdapter(trendingEnglishAdapter);
    }

    private void buildData() {

        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.holdon,"Hold On","JustinBiber","https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview128/v4/70/37/c0/7037c092-4953-45fb-0cd9-9e7230227e4d/mzaf_7998885633374904451.plus.aac.p.m4a"));
        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.fake_a_smile,"Fake_a_Smile","Alan Walker","https://video-ssl.itunes.apple.com/itunes-assets/Video124/v4/bd/43/5c/bd435c9a-ce0f-6277-deae-dce5054bde23/mzvf_4195779879473843903.640x354.h264lc.U.p.m4v"));
        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.selfish_love,"selfish_love","DJ Snake","\"https://video-ssl.itunes.apple.com/itunes-assets/Video124/v4/3b/b9/5f/3bb95f9b-1245-038d-32e1-f73bf1ecdb32/mzvf_3220476304840481121.640x478.h264lc.U.p.m4v"));
        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.balia_conmigo,"balia_conmigo","Selena Gomez","https://soundcloud.com/ubeyt-aslan2/aragon-music-ft-arozin-sabyh-daria-baila-conmigo-remix"));
        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.anyone,"anyone","Justin Biber","https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview113/v4/66/fd/40/66fd4045-d6a5-93c9-c847-d0edc06ce365/mzaf_7491208045632462973.std.aac.p.m4a"));
        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.big,"Big","Bang Rita","https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview113/v4/66/fd/40/66fd4045-d6a5-93c9-c847-d0edc06ce365/mzaf_7491208045632462973.std.aac.p.m4a"));
    }


    @Override
    public void OnItemClickListeners(int position, TrendingEnglishSongModel trendingEnglishSongModel) {

   //     Toast.makeText(mContext, ""+position+"", Toast.LENGTH_SHORT).show();

        GetSongUrl(position);

    }

    private void GetSongUrl(int position) {


//
//        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.holdon,"Hold On","JustinBiber","https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview128/v4/70/37/c0/7037c092-4953-45fb-0cd9-9e7230227e4d/mzaf_7998885633374904451.plus.aac.p.m4a"));
//        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.fake_a_smile,"Fake_a_Smile","Alan Walker","https://video-ssl.itunes.apple.com/itunes-assets/Video124/v4/bd/43/5c/bd435c9a-ce0f-6277-deae-dce5054bde23/mzvf_4195779879473843903.640x354.h264lc.U.p.m4v"));
//        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.selfish_love,"selfish_love","DJ Snake","\"https://video-ssl.itunes.apple.com/itunes-assets/Video124/v4/3b/b9/5f/3bb95f9b-1245-038d-32e1-f73bf1ecdb32/mzvf_3220476304840481121.640x478.h264lc.U.p.m4v"));
//        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.balia_conmigo,"balia_conmigo","Selena Gomez","https://soundcloud.com/ubeyt-aslan2/aragon-music-ft-arozin-sabyh-daria-baila-conmigo-remix"));
//        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.anyone,"anyone","Justin Biber","https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview113/v4/66/fd/40/66fd4045-d6a5-93c9-c847-d0edc06ce365/mzaf_7491208045632462973.std.aac.p.m4a"));
//        trendingEnglishSongModels.add(new TrendingEnglishSongModel(R.drawable.big,"Big","Bang Rita","https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview113/v4/66/fd/40/66fd4045-d6a5-93c9-c847-d0edc06ce365/mzaf_7491208045632462973.std.aac.p.m4a"));
//      //  trendingEnglishAdapter.notifyItemChanged(position);


    }


}