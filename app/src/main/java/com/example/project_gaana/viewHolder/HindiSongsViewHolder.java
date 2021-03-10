package com.example.project_gaana.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.model.HindiModel;

public class HindiSongsViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivHindiSong;
    private TextView tvHindiSongName;
    private TextView tvHindiDownloads;

    public HindiSongsViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivHindiSong = itemView.findViewById(R.id.ivHindiSong);
        tvHindiSongName = itemView.findViewById(R.id.tvHindiSongName);
        tvHindiDownloads = itemView.findViewById(R.id.tvHindiDownloads);
    }

    public void setData(HindiModel hindiModel) {
        ivHindiSong.setImageResource(hindiModel.getIvHindiSong());
        tvHindiSongName.setText(hindiModel.getTvHindiSongName());
        tvHindiDownloads.setText(hindiModel.getTvHindiDownloads());
    }
}
