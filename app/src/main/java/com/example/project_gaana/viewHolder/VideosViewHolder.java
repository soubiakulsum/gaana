package com.example.project_gaana.viewHolder;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.activities.GaanaVideoActivity;
import com.example.project_gaana.model.VediosModel;

public class VideosViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivGaanaVedio;
    private TextView tvVideoName;
    private TextView tvSingerName;
    Context context;
    public VideosViewHolder(@NonNull View itemView,Context context) {
        super(itemView);
        this.context=context;
        initViews(itemView);

    }

    private void initViews(View itemView) {
        ivGaanaVedio = itemView.findViewById(R.id.ivGaanaVedio);
        tvVideoName = itemView.findViewById(R.id.tvVideoName);
        tvSingerName = itemView.findViewById(R.id.tvSingerName);
    }

    public void setData(VediosModel vediosModel) {
        ivGaanaVedio.setImageResource(vediosModel.getIvGaanaVedio());
        tvVideoName.setText(vediosModel.getTvVideoName());
        tvSingerName.setText(vediosModel.getTvSingerName());

        ivGaanaVedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, GaanaVideoActivity.class);
                intent.putExtra("tvVideoName",vediosModel.getTvVideoName());
                intent.putExtra("videoUrl",vediosModel.getGaanaVideoUrl());
                intent.putExtra("singerName",vediosModel.getTvSingerName());


                context.startActivity(intent);
            }
        });

    }
}
