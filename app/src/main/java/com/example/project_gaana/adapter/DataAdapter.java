package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.OnClickListener;
import com.example.project_gaana.Responses;
import com.example.project_gaana.viewHolder.DataViewHolder;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {
    OnClickListener onClickListener;

    public DataAdapter(Responses responseList, OnClickListener onClickListener) {
        this.responseList = responseList;
        this.onClickListener = onClickListener;
    }

    Responses responseList;

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,
                false);
        return new DataViewHolder(view,onClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        Responses response = responseList;
        holder.setData(position,response.getResults().get(position));

    }

    @Override
    public int getItemCount() {
        return responseList.getResults().size();
    }

    public void updateList(Responses responseList) {
        this.responseList = responseList;
        notifyDataSetChanged();
    }
}
