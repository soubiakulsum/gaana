package com.example.project_gaana.viewHolder;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.activities.HindiDummyActivity;
import com.example.project_gaana.model.TopChartsModel;

public class TopChartViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivTopChartSong;
    private TextView tvTopChartSongName;
    private TextView tvTopChartSongDownload;
    CardView CvTopChartCard;

    public TopChartViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivTopChartSong = itemView.findViewById(R.id.ivTopChartSong);
        tvTopChartSongName = itemView.findViewById(R.id.tvTopChartSongName);
        tvTopChartSongDownload = itemView.findViewById(R.id.tvTopChartSongDownload);

        CvTopChartCard=itemView.findViewById(R.id.topChartCard);

    }

    public void setData(TopChartsModel topChartsModel) {
        ivTopChartSong.setImageResource(topChartsModel.getIvTopChartSong());
        tvTopChartSongName.setText(topChartsModel.getTvTopChartSongName());
        tvTopChartSongDownload.setText(topChartsModel.getTvTopChartSongDownload());

        CvTopChartCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), HindiDummyActivity.class);
                intent.putExtra("image",topChartsModel.getIvTopChartSong());
                v.getContext().startActivity(intent);

            }
        });
    }
}
