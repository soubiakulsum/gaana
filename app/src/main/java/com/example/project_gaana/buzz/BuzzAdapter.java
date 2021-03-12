package com.example.project_gaana.buzz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.R;
import com.example.project_gaana.fragments.RecyclerViewItemCickListener;

import java.util.List;

public class BuzzAdapter extends RecyclerView.Adapter<BuzzViewHolder>{


    private List<Buzz> buzzList;
    RecyclerViewItemCickListener recyclerViewItemCickListener;

    public BuzzAdapter(List<Buzz> buzzList, RecyclerViewItemCickListener recyclerViewItemCickListener) {
        this.buzzList = buzzList;
        this.recyclerViewItemCickListener = recyclerViewItemCickListener;
    }

    @NonNull
    @Override
    public BuzzViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buzz_item_layout, parent, false);

        return new BuzzViewHolder(view,recyclerViewItemCickListener);
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
