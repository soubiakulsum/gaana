package com.example.project_gaana.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_gaana.R;


public class TopHitsFragment extends Fragment {

    public TopHitsFragment() {
        // Required empty public constructor
    }

    public static TopHitsFragment newInstance(){
        TopHitsFragment topHitsFragment = new TopHitsFragment();
        return topHitsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_hits, container, false);
    }
}