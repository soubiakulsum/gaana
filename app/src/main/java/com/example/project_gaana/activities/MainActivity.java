package com.example.project_gaana.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.project_gaana.ApiService;
import com.example.project_gaana.NetworkModel.Network;
import com.example.project_gaana.OnClickListener;
import com.example.project_gaana.R;
import com.example.project_gaana.Responses;
import com.example.project_gaana.ResultsItem;
import com.example.project_gaana.adapter.DataAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private ImageView SearchVoice;
    private RecyclerView recyclerView;
    private Responses responseList = new Responses();
    private DataAdapter dataAdapter;
    private EditText etSearch;
    public MediaPlayer mediaPlayer = new MediaPlayer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SearchVoice = findViewById(R.id.btnFetch);
        recyclerView = findViewById(R.id.rvDataFetch);
        etSearch = findViewById(R.id.etSearch);

        SearchVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                 Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                 intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                 intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

                 intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Search Songs,Playlist & Singer");

                 try {
                     startActivityForResult(intent, 1);
                 }catch (ActivityNotFoundException e){

                     Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                 }


            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){

            case 1:

                if(resultCode==RESULT_OK && null!=data){

                    ArrayList<String> result =
                            data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    etSearch.setText(result.get(0));

                    callApi(etSearch);

                }

                break;
        }
    }

    private void callApi(EditText etSearch) {
        String str = etSearch.getText().toString();
        ApiService apiService = Network.getInstance().create(ApiService.class);
        apiService.getUser(str).enqueue(new Callback<Responses>() {
            @Override
            public void onResponse(Call<Responses> call, retrofit2.Response<Responses> response) {
                setRecyclerView(responseList);
                if (response.body() != null) {
                    responseList = response.body();
                    dataAdapter.updateList(responseList);
                }
            }

            @Override
            public void onFailure(Call<Responses> call, Throwable t) {

            }
        });
    }

    private void setRecyclerView(Responses responseList) {

        dataAdapter = new DataAdapter(responseList,this);
        dataAdapter.notifyDataSetChanged();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dataAdapter);
    }

    @Override
    public void playMusic(int pos, ResultsItem resultsItem) {
        mediaPlayer.reset();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(resultsItem.getPreviewUrl());
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.start();
    }

    @Override
    public void pauseMusic() {
        mediaPlayer.stop();
    }

    @Override
    public void delete(int pos) {
        responseList.getResults().remove(pos);
        dataAdapter.updateList(responseList);
    }

}