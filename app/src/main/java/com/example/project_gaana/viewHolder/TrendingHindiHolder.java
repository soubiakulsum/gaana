package com.example.project_gaana.viewHolder;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.DataModel.TrendingEnglishSongModel;
import com.example.project_gaana.DataModel.TrendingHindiSongModel;
import com.example.project_gaana.ItemClickListeners;
import com.example.project_gaana.R;
import com.example.project_gaana.activities.PlayHindiMusicActivity;
import com.example.project_gaana.activities.PlayMusicActivity;
import com.example.project_gaana.fragments.RecyclerViewItemCickListener;

public class TrendingHindiHolder extends RecyclerView.ViewHolder {

    ImageView ivSongImage;
    TextView tvSongName;

    TextView tvSingerName;

    ConstraintLayout mcvPlayMusic;

    ItemClickListeners itemClickListeners;


    public TrendingHindiHolder(@NonNull View itemView) {
        super(itemView);

        ivSongImage = itemView.findViewById(R.id.SongImage);
        tvSongName = itemView.findViewById(R.id.SongName);
        tvSingerName = itemView.findViewById(R.id.SongSinger);
        mcvPlayMusic = itemView.findViewById(R.id.cardPlayMusic);
    }

    public void SetData(TrendingHindiSongModel trendingHindiSongModel) {

        ivSongImage.setImageResource(trendingHindiSongModel.getImage());

        tvSongName.setText(trendingHindiSongModel.getSongName());

        tvSingerName.setText(trendingHindiSongModel.getSingerName());

        mcvPlayMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), PlayHindiMusicActivity.class);
                intent.putExtra("image", trendingHindiSongModel.getImage());
                intent.putExtra("songName", trendingHindiSongModel.getSongName());
                intent.putExtra("singerName",trendingHindiSongModel.getSingerName());
                intent.putExtra("url", trendingHindiSongModel.getUrl());

                v.getContext().startActivity(intent);

            }
        });
    }
}
