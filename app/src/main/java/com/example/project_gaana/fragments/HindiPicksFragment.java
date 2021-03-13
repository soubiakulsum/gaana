package com.example.project_gaana.fragments;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project_gaana.DataModel.TrendingEnglishSongModel;
import com.example.project_gaana.DataModel.TrendingHindiSongModel;
import com.example.project_gaana.R;
import com.example.project_gaana.adapter.HindiSongsAdapter;
import com.example.project_gaana.adapter.TrendingEnglishAdapter;
import com.example.project_gaana.adapter.TrendingHindiAdapter;
import com.example.project_gaana.model.TrendingHindiModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HindiPicksFragment extends Fragment {

    RecyclerView mRecyclerView;

    List<TrendingHindiSongModel> trendingHindiSongModels = new ArrayList<>();

    TrendingHindiAdapter trendingHindiAdapter;


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
        return inflater.inflate(R.layout.fragment_hindi_picks, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = view.findViewById(R.id.RecyclerView);

        buildData();

        SetRecyclerAdapter();


        mContext = getContext();
        mActivity = HindiPicksFragment.this;
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

    private void buildData() {

        trendingHindiSongModels.add(new TrendingHindiSongModel(R.drawable.tumhiaana,"Tum Hi Aana",
                "Jubin ","https://firebasestorage.googleapis.com/v0/b/music-ebc56.appspot.com/o/yt1s.com%20-%20Tum%20Hi%20Aana%20Full%20Video%20%20Marjaavaan%20%20Riteish%20D%20Sidharth%20M%20Tara%20S%20%20Jubin%20N%20%20Payal%20Dev%20Kunaal%20V.mp3?alt=media&token=96897ea1-1ff1-416f-b34f-9b384186cf21"));

        trendingHindiSongModels.add(new TrendingHindiSongModel(R.drawable.suit,"Suit ",
                "Guru Randhawa ","https://firebasestorage.googleapis.com/v0/b/music-ebc56.appspot.com/o/yt1s.com%20-%20Suit%20Full%20Video%20Song%20%20Guru%20Randhawa%20Feat%20Arjun%20%20TSeries.mp3?alt=media&token=49ef7873-d5ee-402c-b399-e82b5d769b6b"));

        trendingHindiSongModels.add(new TrendingHindiSongModel(R.drawable.baarish,"Baarish",
                "Sashaa Tanishk","https://firebasestorage.googleapis.com/v0/b/music-ebc56.appspot.com/o/yt1s.com%20-%20Baarish%20%20Full%20Video%20%20Half%20Girlfriend%20%20Arjun%20Kapoor%20%20Shraddha%20Kapoor%20Ash%20King%20%20Sashaa%20%20Tanishk.mp3?alt=media&token=d176534c-cb74-4aeb-9822-01768f1071d9"));

        trendingHindiSongModels.add(new TrendingHindiSongModel(R.drawable.tujhekitna,"Tujhe Kitna ",
       "Mithoon Feat","https://firebasestorage.googleapis.com/v0/b/music-ebc56.appspot.com/o/yt1s.com%20-%20Full%20Song%20Tujhe%20Kitna%20Chahne%20Lage%20%20Kabir%20Singh%20%20Mithoon%20Feat%20Arijit%20Singh%20%20Shahid%20K%20Kiara%20A.mp3?alt=media&token=f73b0a61-924b-4107-97ab-a69ea9c8f707" ));


        trendingHindiSongModels.add(new TrendingHindiSongModel(R.drawable.vaaste,"Vaaste Song ",
                "Dhvani Bhanushali","https://firebasestorage.googleapis.com/v0/b/music-ebc56.appspot.com/o/yt1s.com%20-%20Vaaste%20Song%20Dhvani%20Bhanushali%20Tanishk%20Bagchi%20%20Nikhil%20D%20%20Bhushan%20Kumar%20%20Radhika%20Rao%20Vinay%20Sapru.mp3?alt=media&token=85ab7ef8-a629-43f8-b63e-283cfc4d5832"));


         trendingHindiSongModels.add(new TrendingHindiSongModel(R.drawable.dilbar,"Dilbar Dilbar",
                 "Tanishk","https://firebasestorage.googleapis.com/v0/b/music-ebc56.appspot.com/o/yt1s.com%20-%20DILBAR%20Full%20Song%20%20Satyameva%20Jayate%20%20John%20Abraham%20Nora%20Fatehi%20%20Tanishk%20B%20Neha%20Kakkar%20Ikka%20Dhvani.mp3?alt=media&token=ae5ef895-478a-48ce-90e2-b199cda82379"));


         trendingHindiSongModels.add(new TrendingHindiSongModel(R.drawable.paachtaoge,"paachaoge","Arijit Singh",
               "https://firebasestorage.googleapis.com/v0/b/music-ebc56.appspot.com/o/yt1s.com%20-%20Arijit%20Singh%20Pachtaoge%20%20Vicky%20Kaushal%20Nora%20Fatehi%20Jaani%20B%20Praak%20Arvindr%20Khaira%20%20Bhushan%20Kumar.mp3?alt=media&token=c567d5ee-cbff-4a71-a637-0904011c1301"  ));


        trendingHindiSongModels.add(new TrendingHindiSongModel(R.drawable.saaiyanji,"saaiyan ji","Honey Singh",
                "https://firebasestorage.googleapis.com/v0/b/music-ebc56.appspot.com/o/yt1s.com%20-%20Saiyaan%20Ji%20%20Yo%20Yo%20Honey%20Singh%20Neha%20KakkarNushrratt%20Bharuccha%20%20Lil%20G%20Hommie%20D%20Mihir%20GBhushan%20K.mp3?alt=media&token=f9141e69-4e77-4e53-b9d3-2ab8a0658e9d"));


        trendingHindiSongModels.add(new TrendingHindiSongModel(R.drawable.hua_hai_aaj,"Hua hai aaj Pheli baar",
                "Araaman Malik","https://firebasestorage.googleapis.com/v0/b/music-ebc56.appspot.com/o/yt1s.com%20-%20Hua%20Hain%20Aaj%20Pehli%20Baar%20FULL%20VIDEO%20%20SANAM%20RE%20%20Pulkit%20Samrat%20Urvashi%20Rautela%20%20Divya%20Khosla%20Kumar.mp3?alt=media&token=d80bc87a-637e-479e-8d16-d897992a6354"));


    }

    private void SetRecyclerAdapter() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
         trendingHindiAdapter = new TrendingHindiAdapter(trendingHindiSongModels);
        mRecyclerView.setAdapter(trendingHindiAdapter);

    }

}