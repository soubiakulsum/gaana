package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.OnItemClicked;
import com.example.project_gaana.model.PopularEnglishModel;
import com.example.project_gaana.viewHolder.PopularEnglishViewHolder;
import com.example.project_gaana.R;

import java.util.List;

public class PopularEnglishAdapter extends RecyclerView.Adapter<PopularEnglishViewHolder> {
    private List<PopularEnglishModel> popularEnglishModelList;
    private OnItemClicked onItemClicked;

    public PopularEnglishAdapter(List<PopularEnglishModel> popularEnglishModelList,OnItemClicked onItemClicked) {
        this.popularEnglishModelList = popularEnglishModelList;
        this.onItemClicked = onItemClicked;
    }

    @NonNull
    @Override
    public PopularEnglishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.english_item_layout, parent, false);
        return new PopularEnglishViewHolder(view,onItemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularEnglishViewHolder holder, int position) {
        PopularEnglishModel popularEnglishModel = popularEnglishModelList.get(position);
        holder.setData(popularEnglishModel);
    }

    @Override
    public int getItemCount() {
        return popularEnglishModelList.size();
    }
}
