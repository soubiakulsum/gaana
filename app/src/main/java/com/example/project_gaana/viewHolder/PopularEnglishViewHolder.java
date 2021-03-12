package com.example.project_gaana.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.OnItemClicked;
import com.example.project_gaana.R;
import com.example.project_gaana.model.PopularEnglishModel;

public class PopularEnglishViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivEnglishSong;
    private TextView tvEnglishSongName;
    private TextView tvEnglishSinger;
    private TextView tvEnglishDownloads;
    private OnItemClicked onItemClicked;

    public PopularEnglishViewHolder(@NonNull View itemView,OnItemClicked onItemClicked) {
        super(itemView);
        this.onItemClicked = onItemClicked;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivEnglishSong = itemView.findViewById(R.id.ivEnglishSong);
        tvEnglishSongName = itemView.findViewById(R.id.tvEnglishSongName);
        tvEnglishSinger = itemView.findViewById(R.id.tvEnglishSinger);
        tvEnglishDownloads = itemView.findViewById(R.id.tvEnglishDownloads);
    }

    public void setData(PopularEnglishModel popularEnglishModel) {
        ivEnglishSong.setImageResource(popularEnglishModel.getIvEnglishSong());
        tvEnglishSongName.setText(popularEnglishModel.getTvEnglishSongName());
        tvEnglishSinger.setText(popularEnglishModel.getTvEnglishSinger());
        tvEnglishDownloads.setText(popularEnglishModel.getTvEnglishDownloads());
        ivEnglishSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClicked.OnItemClicked(popularEnglishModel);
            }
        });
    }
}
