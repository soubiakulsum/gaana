package com.example.project_gaana.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.model.VediosModel;
import com.example.project_gaana.viewHolder.VideosViewHolder;

import java.util.List;

public class VideosAdapter extends RecyclerView.Adapter<VideosViewHolder> {
    private List<VediosModel> vediosModelList;

    Context context;

    public VideosAdapter(List<VediosModel> vediosModelList,Context context) {
        this.vediosModelList = vediosModelList;

        this.context=context;
    }

    @NonNull
    @Override
    public VideosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vedios_iteem_layout, parent, false);
        return new VideosViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(@NonNull VideosViewHolder holder, int position) {
        VediosModel vediosModel = vediosModelList.get(position);
        holder.setData(vediosModel);
    }

    @Override
    public int getItemCount() {
        return vediosModelList.size();
    }
}
