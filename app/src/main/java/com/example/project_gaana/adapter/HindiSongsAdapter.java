package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.OnItemClicked;
import com.example.project_gaana.R;
import com.example.project_gaana.model.HindiModel;
import com.example.project_gaana.viewHolder.HindiSongsViewHolder;

import java.util.List;

public class HindiSongsAdapter extends RecyclerView.Adapter<HindiSongsViewHolder> {

    private List<HindiModel>hindiModelList;
    private OnItemClicked onItemClicked;

    public HindiSongsAdapter(List<HindiModel> hindiModelList,OnItemClicked onItemClicked) {
        this.hindiModelList = hindiModelList;
        this.onItemClicked = onItemClicked;
    }

    @NonNull
    @Override
    public HindiSongsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hindi_item_layout,parent,false);
        return new HindiSongsViewHolder(view,onItemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull HindiSongsViewHolder holder, int position) {

        HindiModel hindiModel = hindiModelList.get(position);
        holder.setData(hindiModel);

    }

    @Override
    public int getItemCount() {
        return hindiModelList.size();
    }
}
