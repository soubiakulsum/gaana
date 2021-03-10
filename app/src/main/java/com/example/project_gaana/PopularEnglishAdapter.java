package com.example.project_gaana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PopularEnglishAdapter extends RecyclerView.Adapter<PopularEnglishViewHolder> {
    private List<PopularEnglishModel> popularEnglishModelList;

    public PopularEnglishAdapter(List<PopularEnglishModel> popularEnglishModelList) {
        this.popularEnglishModelList = popularEnglishModelList;
    }

    @NonNull
    @Override
    public PopularEnglishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.english_item_layout, parent, false);
        return new PopularEnglishViewHolder(view);
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
