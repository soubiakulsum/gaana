package com.example.project_gaana.viewHolder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.model.TopPicksModel;

public class PicksViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivTopPicks;
    public PicksViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivTopPicks = itemView.findViewById(R.id.ivTopPicks);
    }

    public void setData(TopPicksModel topPicksModel) {
        ivTopPicks.setImageResource(topPicksModel.getIvTopPicks());
    }
}
