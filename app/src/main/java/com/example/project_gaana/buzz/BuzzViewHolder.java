package com.example.project_gaana.buzz;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;

public class BuzzViewHolder extends RecyclerView.ViewHolder {

    private TextView mlike;
    private TextView mdaysAgo;
    private TextView marticle;
    private TextView mextendArticle;


    public BuzzViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
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
    }

}
