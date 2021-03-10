package com.example.project_gaana.viewHolder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.model.DiscoverModel;

public class DiscoverViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivDiscover;
    public DiscoverViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivDiscover = itemView.findViewById(R.id.ivDiscover);
    }

    public void setData(DiscoverModel discoverModel) {
        ivDiscover.setImageResource(discoverModel.getIvDiscover());
    }
}
