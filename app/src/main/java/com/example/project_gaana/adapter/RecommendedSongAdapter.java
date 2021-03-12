package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.DataModel.RecommendedModel;
import com.example.project_gaana.ItemClickListeners;
import com.example.project_gaana.R;
import com.example.project_gaana.viewHolder.RecommendedSongHolder;

import java.util.ArrayList;
import java.util.List;

public class RecommendedSongAdapter extends RecyclerView.Adapter<RecommendedSongHolder> {

    List<RecommendedModel> recommendedModels = new ArrayList<>();

    ItemClickListeners itemClickListeners;

    public RecommendedSongAdapter(List<RecommendedModel> recommendedModels, ItemClickListeners itemClickListeners) {
        this.recommendedModels = recommendedModels;

        this.itemClickListeners=itemClickListeners;
    }

    @NonNull
    @Override
    public RecommendedSongHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recommended_item,parent,false);

        return new RecommendedSongHolder(view,itemClickListeners);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedSongHolder holder, int position) {

        RecommendedModel recommendedModel = recommendedModels.get(position);

        holder.SetHolder(recommendedModel);


    }

    @Override
    public int getItemCount() {
        return recommendedModels.size();
    }
}
