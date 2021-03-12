package com.example.project_gaana.viewHolder;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.DataModel.RecommendedModel;
import com.example.project_gaana.ItemClickListeners;
import com.example.project_gaana.R;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import pl.droidsonroids.gif.GifImageView;

public class RecommendedSongHolder extends RecyclerView.ViewHolder {

    ImageView ivRecommendedSong;

    TextView tvRecommendedSongName;

    ConstraintLayout cvRecommendedPlayMusics;

    private MediaPlayer mPlayer;

    int length;

    ItemClickListeners itemClickListeners;

    ImageButton givPause;



    public RecommendedSongHolder(@NonNull View itemView, ItemClickListeners itemClickListeners) {

        super(itemView);

        this.itemClickListeners=itemClickListeners;

        ivRecommendedSong=itemView.findViewById(R.id.RecommendedSongImage);

        tvRecommendedSongName=itemView.findViewById(R.id.RecommendedSongName);


        cvRecommendedPlayMusics=itemView.findViewById(R.id.RecommendedPlayMusics);

        givPause=itemView.findViewById(R.id.Pausebtn);






    }

    public void SetHolder(RecommendedModel recommendedModel) {

        tvRecommendedSongName.setText(recommendedModel.getSongName());

        try {
            Picasso.get().load(recommendedModel.getImageUrl()).into(ivRecommendedSong);
        } catch (Exception e) {

        }

        String uri = recommendedModel.getSongUrl();

        itemClickListeners.OnItemClickListeners(getAdapterPosition(),recommendedModel);


        cvRecommendedPlayMusics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              givPause.setVisibility(View.VISIBLE);


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
              //  Toast.makeText(v.getContext(), "Media Player is playing.", Toast.LENGTH_SHORT).show();



            }

        });


         givPause.setOnClickListener(new View.OnClickListener() {



       @Override
       public void onClick(View view) {

           givPause.setVisibility(View.INVISIBLE);

           mPlayer.pause();
           length = mPlayer.getCurrentPosition();
       }
    });


    }


}
