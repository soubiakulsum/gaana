package com.example.project_gaana.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.model.TrendingSongsModel;

public class TrendingViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivTrendingSong;
    private TextView tvTrendingSongName;
    private TextView tvTrendingSongDownload;

    public TrendingViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivTrendingSong = itemView.findViewById(R.id.ivTrendingSong);
        tvTrendingSongName = itemView.findViewById(R.id.tvTrendingSongName);
        tvTrendingSongDownload = itemView.findViewById(R.id.tvTrendingSongDownload);
    }

    public void setData(TrendingSongsModel trendingSongsModel) {
        ivTrendingSong.setImageResource(trendingSongsModel.getIvTrendingSong());
        tvTrendingSongName.setText(trendingSongsModel.getTvTrendingSongName());
        tvTrendingSongDownload.setText(trendingSongsModel.getTvTrendingSongDownload());
    }
}
