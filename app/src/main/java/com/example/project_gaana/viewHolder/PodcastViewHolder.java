package com.example.project_gaana.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.model.PodcatsModel;
import com.example.project_gaana.R;

public class PodcastViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivPodcasts;
    private TextView tvPodcastName;
    public PodcastViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivPodcasts = itemView.findViewById(R.id.ivPodcasts);
        tvPodcastName = itemView.findViewById(R.id.tvPodcastName);
    }

    public void setData(PodcatsModel podcatsModel) {
        ivPodcasts.setImageResource(podcatsModel.getIvPodcasts());
        tvPodcastName.setText(podcatsModel.getTvPodcastName());
    }
}
