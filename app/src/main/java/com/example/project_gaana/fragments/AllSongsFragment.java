package com.example.project_gaana.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_gaana.PicksAdapter;
import com.example.project_gaana.R;
import com.example.project_gaana.TopPicksModel;
import com.ryan.rv_gallery.GalleryRecyclerView;

import java.util.ArrayList;
import java.util.List;


public class AllSongsFragment extends Fragment {

    private List<TopPicksModel>topPicksModelList = new ArrayList<>();
    private GalleryRecyclerView TopPicksRecycler;


    public AllSongsFragment() {
        // Required empty public constructor
    }

    public static AllSongsFragment newInstance() {
        AllSongsFragment allSongsFragment = new AllSongsFragment();
        return allSongsFragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_songs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildData();
        setRecyclerData();
    }

    private void setRecyclerData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        PicksAdapter picksAdapter = new PicksAdapter(topPicksModelList);
        TopPicksRecycler.setLayoutManager(linearLayoutManager);
        TopPicksRecycler.setAdapter(picksAdapter);
    }

    private void buildData() {
        topPicksModelList.add(new TopPicksModel(R.drawable.batein));
        topPicksModelList.add(new TopPicksModel(R.drawable.djsnake));
        topPicksModelList.add(new TopPicksModel(R.drawable.drake));
        topPicksModelList.add(new TopPicksModel(R.drawable.gandhi));
        topPicksModelList.add(new TopPicksModel(R.drawable.meri));
        topPicksModelList.add(new TopPicksModel(R.drawable.lovedance));

    }

    private void initViews(View view) {
        TopPicksRecycler = view.findViewById(R.id.TopPicksRecycler);
    }
}