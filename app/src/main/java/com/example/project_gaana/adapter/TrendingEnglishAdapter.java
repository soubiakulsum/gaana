package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.DataModel.TrendingEnglishSongModel;
import com.example.project_gaana.ItemClickListeners;
import com.example.project_gaana.R;
import com.example.project_gaana.viewHolder.TrendingEnglishSongHolder;

import java.util.ArrayList;
import java.util.List;

public class TrendingEnglishAdapter extends RecyclerView.Adapter<TrendingEnglishSongHolder> {

   ItemClickListeners itemClickListeners;

    List<TrendingEnglishSongModel> trendingEnglishSongModels = new ArrayList<>();
    public TrendingEnglishAdapter(List<TrendingEnglishSongModel> trendingEnglishSongModels, ItemClickListeners itemClickListeners) {

        this.trendingEnglishSongModels=trendingEnglishSongModels;
        this.itemClickListeners=itemClickListeners;


    }

    @NonNull
    @Override
    public TrendingEnglishSongHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trending_english_songs,parent,false);
        return new TrendingEnglishSongHolder(view,itemClickListeners);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingEnglishSongHolder holder, int position) {

      TrendingEnglishSongModel trendingEnglishSongModel = trendingEnglishSongModels.get(position);

      holder.SetData(trendingEnglishSongModel);


    }

    @Override
    public int getItemCount() {
        return trendingEnglishSongModels.size();
    }
}
