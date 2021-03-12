package com.example.project_gaana.buzz;

import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;

public class BuzzViewHolder extends RecyclerView.ViewHolder {

    private TextView mlike;
    private TextView mdaysAgo;
    private TextView marticle;
    private TextView mextendArticle;

    private VideoView vVBuzz;

    private ProgressBar progressBar;


    public BuzzViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mlike =itemView.findViewById(R.id.buzzlike);
        mdaysAgo =itemView.findViewById(R.id.twodaysago);
        marticle =itemView.findViewById(R.id.buzzarticle);
        mextendArticle =itemView.findViewById(R.id.Fullarticle);
        progressBar=itemView.findViewById(R.id.videoProgressBar);
        vVBuzz=itemView.findViewById(R.id.buzzVideoView);

    }


    public void setData(Buzz buzz) {
        mlike.setText(buzz.getLike());
        mdaysAgo.setText(buzz.getDaysAgo());
        marticle.setText(buzz.getArticle());
        mextendArticle.setText(buzz.getExpandArtile());

        marticle.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        marticle.setSelected(true);

        vVBuzz.setVideoPath(buzz.getVideoUrl());




       vVBuzz.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
        @Override
        public void onPrepared(MediaPlayer mediaPlayer) {
            progressBar.setVisibility(View.INVISIBLE);
            mediaPlayer.start();

        }
    });

            vVBuzz.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {

            mediaPlayer.start();

        }
    });

}

}
