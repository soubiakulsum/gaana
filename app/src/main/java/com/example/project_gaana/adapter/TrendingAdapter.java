package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.viewHolder.TrendingViewHolder;
import com.example.project_gaana.model.TrendingSongsModel;

import java.util.List;

public class TrendingAdapter extends RecyclerView.Adapter<TrendingViewHolder> {
    private List<TrendingSongsModel> trendingSongsModelList;

    public TrendingAdapter(List<TrendingSongsModel> trendingSongsModelList) {
        this.trendingSongsModelList = trendingSongsModelList;
    }

    @NonNull
    @Override
    public TrendingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trending_item_layout, parent, false);
        return new TrendingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingViewHolder holder, int position) {
        TrendingSongsModel trendingSongsModel = trendingSongsModelList.get(position);
        holder.setData(trendingSongsModel);
    }

    @Override
    public int getItemCount() {
        return trendingSongsModelList.size();
    }
}
