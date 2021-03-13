package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.DataModel.TrendingEnglishSongModel;
import com.example.project_gaana.DataModel.TrendingHindiSongModel;
import com.example.project_gaana.R;
import com.example.project_gaana.viewHolder.TrendingEnglishSongHolder;
import com.example.project_gaana.viewHolder.TrendingHindiHolder;

import java.util.ArrayList;
import java.util.List;

public class TrendingHindiAdapter extends RecyclerView.Adapter<TrendingHindiHolder> {

    List<TrendingHindiSongModel> trendingHindiSongModels = new ArrayList<>();

    public TrendingHindiAdapter(List<TrendingHindiSongModel> trendingHindiSongModels) {
        this.trendingHindiSongModels = trendingHindiSongModels;
    }

    @NonNull
    @Override
    public TrendingHindiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trending_hindi_song,parent,false);
        return new TrendingHindiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingHindiHolder holder, int position) {

        TrendingHindiSongModel trendingHindiSongModel = trendingHindiSongModels.get(position);

        holder.SetData(trendingHindiSongModel);


    }

    @Override
    public int getItemCount() {
        return trendingHindiSongModels.size();
    }
}
