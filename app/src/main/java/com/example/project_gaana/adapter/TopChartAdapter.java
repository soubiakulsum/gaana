package com.example.project_gaana.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.model.TopChartsModel;
import com.example.project_gaana.viewHolder.TopChartViewHolder;

import java.util.List;

public class TopChartAdapter extends RecyclerView.Adapter<TopChartViewHolder> {

    private List<TopChartsModel> topChartsModelList;

    public TopChartAdapter(List<TopChartsModel> topChartsModelList) {
        this.topChartsModelList = topChartsModelList;
    }

    @NonNull
    @Override
    public TopChartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_charts_item_layout, parent, false);
        return new TopChartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopChartViewHolder holder, int position) {
        TopChartsModel topChartsModel = topChartsModelList.get(position);
        holder.setData(topChartsModel);
    }

    @Override
    public int getItemCount() {
        return topChartsModelList.size();
    }
}
