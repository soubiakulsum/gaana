package com.example.project_gaana.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project_gaana.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class BuzzExtended extends Fragment {
    private TextView like;
    private TextView article ;
    private TextView days;
    private TextView expaarticle;


    public BuzzExtended() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buzz_extended, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        getDataFromBundle();



    }

    private void initViews(View view) {
        like = view.findViewById(R.id.tvbuzzlike1);
        article = view.findViewById(R.id.tvbuzzarticle);
        days = view.findViewById(R.id.tvtwodaysago);

    }


    private void getDataFromBundle() {

        if(getArguments() != null){
            String name = getArguments().getString("name");
            String name1 = getArguments().getString("name1");
            String name3 = getArguments().getString("name3");
            like.setText(name3);
            article.setText(name);
            days.setText(name1);
        }

    }}