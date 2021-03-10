package com.example.project_gaana.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_gaana.R;


public class NewSongsFragment extends Fragment {


    public NewSongsFragment() {
        // Required empty public constructor
    }

    public static NewSongsFragment newInstance() {
        NewSongsFragment newSongsFragment = new NewSongsFragment();
        return newSongsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_songs, container, false);
    }
}