package com.example.project_gaana.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_gaana.R;


public class EnglishFragment extends Fragment {


    public EnglishFragment() {
        // Required empty public constructor
    }

    public static EnglishFragment newInstance(){
        EnglishFragment englishFragment = new EnglishFragment();
        return englishFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_english, container, false);
    }
}