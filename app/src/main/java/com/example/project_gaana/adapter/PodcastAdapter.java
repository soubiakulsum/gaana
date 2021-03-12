package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.viewHolder.PodcastViewHolder;
import com.example.project_gaana.model.PodcatsModel;
import com.example.project_gaana.R;

import java.util.List;

public class PodcastAdapter extends RecyclerView.Adapter<PodcastViewHolder> {
    private List<PodcatsModel> podcatsModelList;

    public PodcastAdapter(List<PodcatsModel> podcatsModelList) {
        this.podcatsModelList = podcatsModelList;
    }

    @NonNull
    @Override
    public PodcastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.podcasts_item_layout, parent, false);
        return new PodcastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PodcastViewHolder holder, int position) {
        PodcatsModel podcatsModel = podcatsModelList.get(position);
        holder.setData(podcatsModel);
    }

    @Override
    public int getItemCount() {
        return podcatsModelList.size();
    }
}
