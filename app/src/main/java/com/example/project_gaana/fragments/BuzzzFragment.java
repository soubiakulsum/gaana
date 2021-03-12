package com.example.project_gaana.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_gaana.R;
import com.example.project_gaana.buzz.Buzz;
import com.example.project_gaana.buzz.BuzzAdapter;

import java.util.ArrayList;
import java.util.List;

public class BuzzzFragment extends Fragment {


    private List<Buzz> buzzList = new ArrayList<>();
    private RecyclerView mRecyclerView;

    public BuzzzFragment() {
    }

    public static BuzzzFragment newINstance() {
        BuzzzFragment buzzzFragment = new BuzzzFragment();
        return buzzzFragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.rvRecyclerView);
        BuildRecyclerData();
    //    setRecyclerAdapter();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);


    }

    private void BuildRecyclerData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        BuzzAdapter buzzAdapter = new BuzzAdapter(buzzList);
        mRecyclerView.setAdapter(buzzAdapter);
    }

//    private void setRecyclerAdapter() {
//        for (int i = 0; i < 50; i++) {
//            if (i % 2 == 0) {
//                buzzList.add(new Buzz("2.4k", "2 days ago", "ldjdlijlikjklj   jikjkjdj jikjK", "know more"));
//            }

        }


