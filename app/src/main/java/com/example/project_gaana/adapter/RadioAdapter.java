package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.model.RadioModel;
import com.example.project_gaana.viewHolder.RadioViewHolder;

import java.util.List;

public class RadioAdapter extends RecyclerView.Adapter<RadioViewHolder> {

    private List<RadioModel> radioModelList;

    public RadioAdapter(List<RadioModel> radioModelList) {
        this.radioModelList = radioModelList;
    }

    @NonNull
    @Override
    public RadioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.radio_item_layout, parent, false);
        return new RadioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RadioViewHolder holder, int position) {
        RadioModel radioModel = radioModelList.get(position);
        holder.setData(radioModel);
    }

    @Override
    public int getItemCount() {
        return radioModelList.size();
    }
}
