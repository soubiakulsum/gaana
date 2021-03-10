package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.model.DiscoverModel;
import com.example.project_gaana.viewHolder.DiscoverViewHolder;

import java.util.List;

public class DiscoverAdapter extends RecyclerView.Adapter<DiscoverViewHolder> {
    private List<DiscoverModel>discoverModelList;

    public DiscoverAdapter(List<DiscoverModel> discoverModelList) {
        this.discoverModelList = discoverModelList;
    }

    @NonNull
    @Override
    public DiscoverViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.discover_item_layout,parent,false);
        return new DiscoverViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscoverViewHolder holder, int position) {
        DiscoverModel discoverModel = discoverModelList.get(position);
        holder.setData(discoverModel);

    }

    @Override
    public int getItemCount() {
        return discoverModelList.size();
    }
}
