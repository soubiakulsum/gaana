package com.example.project_gaana.buzz;

import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.fragments.RecyclerViewItemCickListener;

public class BuzzViewHolder extends RecyclerView.ViewHolder {
    private VideoView videoView;
    private TextView mlike;
    private TextView mdaysAgo;
    private TextView marticle;
    private TextView mextendArticle;

    RecyclerViewItemCickListener recyclerViewItemCickListener;
    public BuzzViewHolder(@NonNull View itemView, RecyclerViewItemCickListener recyclerViewItemCickListener) {
        super(itemView);

        initViews(itemView);
        this.recyclerViewItemCickListener = recyclerViewItemCickListener;
    }

    private void initViews(View itemView) {
        videoView= itemView.findViewById(R.id.buzzVideoView);
        mlike =itemView.findViewById(R.id.buzzlike);
        mdaysAgo =itemView.findViewById(R.id.twodaysago);
        marticle =itemView.findViewById(R.id.buzzarticle);
        mextendArticle =itemView.findViewById(R.id.Fullarticle);
    }


    public void setData(Buzz buzz) {
        mlike.setText(buzz.getLike());
        mdaysAgo.setText(buzz.getDaysAgo());
        marticle.setText(buzz.getArticle());
        mextendArticle.setText(buzz.getExpandArtile());
        mextendArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewItemCickListener.OnItemClicked(buzz, getAdapterPosition());

            }
        });


    }

}
