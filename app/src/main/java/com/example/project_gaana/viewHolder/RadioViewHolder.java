package com.example.project_gaana.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.model.RadioModel;

public class RadioViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivRadio;
    private TextView tvRadioName;
    public RadioViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivRadio = itemView.findViewById(R.id.ivRadio);
        tvRadioName = itemView.findViewById(R.id.tvRadioName);
    }

    public void setData(RadioModel radioModel) {
        ivRadio.setImageResource(radioModel.getIvRadio());
        tvRadioName.setText(radioModel.getTvRadioName());
    }
}
