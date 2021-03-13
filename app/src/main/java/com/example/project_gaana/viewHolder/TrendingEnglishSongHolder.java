package com.example.project_gaana.viewHolder;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.DataModel.TrendingEnglishSongModel;
import com.example.project_gaana.ItemClickListeners;
import com.example.project_gaana.R;
import com.example.project_gaana.activities.PlayMusicActivity;

public class TrendingEnglishSongHolder extends RecyclerView.ViewHolder {

    ImageView ivSongImage;
    TextView tvSongName;

    TextView tvSingerName;

    ConstraintLayout mcvPlayMusic;

    ItemClickListeners itemClickListeners;


    public TrendingEnglishSongHolder(@NonNull View itemView, ItemClickListeners itemClickListeners) {
        super(itemView);

        this.itemClickListeners=itemClickListeners;

        ivSongImage=itemView.findViewById(R.id.SongImage);
        tvSongName=itemView.findViewById(R.id.SongName);
        tvSingerName=itemView.findViewById(R.id.SongSinger);
        mcvPlayMusic=itemView.findViewById(R.id.cardPlayMusic);

    }


    public void SetData(TrendingEnglishSongModel trendingEnglishSongModel) {

        ivSongImage.setImageResource(trendingEnglishSongModel.getImage());

        tvSongName.setText(trendingEnglishSongModel.getSongName());

        tvSingerName.setText(trendingEnglishSongModel.getSingerName());

        mcvPlayMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                itemClickListeners.OnItemClickListeners(getAdapterPosition(), trendingEnglishSongModel);

                Intent intent = new Intent(v.getContext(), PlayMusicActivity.class);
                intent.putExtra("image", trendingEnglishSongModel.getImage());
                intent.putExtra("songName", trendingEnglishSongModel.getSongName());
                intent.putExtra("singerName", trendingEnglishSongModel.getSingerName());
                intent.putExtra("url", trendingEnglishSongModel.getUrl());

                v.getContext().startActivity(intent);

            }
        });


    }
}
