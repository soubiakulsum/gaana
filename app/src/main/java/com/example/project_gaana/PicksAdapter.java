package com.example.project_gaana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PicksAdapter extends RecyclerView.Adapter<PicksViewHolder> {
    private List<TopPicksModel>topPicksModelList;

    public PicksAdapter(List<TopPicksModel> topPicksModelList) {
        this.topPicksModelList = topPicksModelList;
    }

    @NonNull
    @Override
    public PicksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.picks_item_layout,parent,false);
        return new PicksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PicksViewHolder holder, int position) {
        TopPicksModel topPicksModel = topPicksModelList.get(position);
        holder.setData(topPicksModel);

    }

    @Override
    public int getItemCount() {
        return topPicksModelList.size();
    }
}
