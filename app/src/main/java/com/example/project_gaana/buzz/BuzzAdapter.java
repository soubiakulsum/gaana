package com.example.project_gaana.buzz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;

import java.util.List;

public class BuzzAdapter extends RecyclerView.Adapter<BuzzViewHolder>{


    private List<Buzz> buzzList;

    public BuzzAdapter(List<Buzz> buzzList) {
        this.buzzList = buzzList;
    }

    @NonNull
    @Override
    public BuzzViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buzz_item_layout, parent, false);

        return new BuzzViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BuzzViewHolder holder, int position) {
        Buzz buzz = buzzList.get(position);
        holder.setData(buzz);

    }

    @Override
    public int getItemCount() {
        return buzzList.size()  ;
    }
}
