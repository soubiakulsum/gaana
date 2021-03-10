package com.example.project_gaana.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.model.VediosModel;
import com.example.project_gaana.viewHolder.VideosViewHolder;

import java.util.List;

public class VideosAdapter extends RecyclerView.Adapter<VideosViewHolder> {
    private List<VediosModel>vediosModelList;

    public VideosAdapter(List<VediosModel> vediosModelList) {
        this.vediosModelList = vediosModelList;
    }

    @NonNull
    @Override
    public VideosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VideosViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
