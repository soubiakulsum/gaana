package com.example.project_gaana.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

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
import com.example.project_gaana.DataModel.RecommendedModel;
import com.example.project_gaana.DataModel.TrendingEnglishSongModel;
import com.example.project_gaana.ItemClickListeners;
import com.example.project_gaana.NetworkModel.Network;
import com.example.project_gaana.OnClickListener;
import com.example.project_gaana.R;
import com.example.project_gaana.Responses;
import com.example.project_gaana.ResultsItem;
import com.example.project_gaana.adapter.DataAdapter;
import com.example.project_gaana.adapter.RecommendedSongAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;

public class SearchActivity extends AppCompatActivity implements OnClickListener, ItemClickListeners {

    private ImageView SearchVoice;
    private RecyclerView recyclerView;
    private Responses responseList = new Responses();
    private DataAdapter dataAdapter;
    private EditText etSearch;
    public MediaPlayer mediaPlayer = new MediaPlayer();


    RecyclerView rvRecommendedRecycler;

    ArrayList<RecommendedModel> recommendedModels = new ArrayList<>();

    RecommendedSongAdapter recommendedSongAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        SearchVoice = findViewById(R.id.btnFetch);
        recyclerView = findViewById(R.id.rvDataFetch);
        etSearch = findViewById(R.id.etSearch);

        rvRecommendedRecycler=findViewById(R.id.RecyclerRecommended);


        buildRecyclerData();

        setRecyclerAdapter();

        SearchVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                rvRecommendedRecycler.setVisibility(View.GONE);




                 Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                 intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                 intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

                 intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Search Songs,Playlist & Singer");

                 try {
                     startActivityForResult(intent, 1);
                 }catch (ActivityNotFoundException e){

                     Toast.makeText(SearchActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                 }


            }
        });

    }

    //Setting Adapter of Recommended Song >>>>>>>

    private void setRecyclerAdapter() {

        StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rvRecommendedRecycler.setLayoutManager(gridLayoutManager);

        recommendedSongAdapter= new RecommendedSongAdapter(recommendedModels,this);

        rvRecommendedRecycler.setAdapter(recommendedSongAdapter);



    }

    // Building Recommended Data>>>

    private void buildRecyclerData() {

    recommendedModels.add(new RecommendedModel("https://a10.gaanacdn.com/images/song/67/34064567/crop_175x175_1610432336.jpg",
            "https://cdnm.meln.top/mr/SongoLyrics%20-%20Full%20song%20with%20lyrics%20-%20Meet%20Bros,%20Arijit%20Singh.mp3?session_key=0983c0b7e443b0c03205208e7c4d7692&hash=831c23d4b3c90e532b0d61081253289b","Oh Saainya"));

    recommendedModels.add(new RecommendedModel("https://a10.gaanacdn.com/images/albums/15/3530015/crop_175x175_3530015.jpg",
            "https://cdnm.meln.top/mx/Shabeer%20Baqri%20-%20Bewafa%20Tera%20Masoom%20Chehra.mp3?hash=LTIwMDE5NjA0NDUvODI5NjA0NDUubXAz","Bewafa Tera Masoor"));

    recommendedModels.add(new RecommendedModel("https://a10.gaanacdn.com/gn_img/albums/oAJbDlbnL8/AJbDwBLjWn/size_m_1581589960.jpg",
            "https://cdnm.meln.top/mr/Muqabla%20-%20Muqabla%20-%20Street%20Dancer%203D%20%7CA.R.%20Rahman,%20Prabhudeva,%20Varun%20D,%20Shraddha%20K,%20Tanishk%20B,%20Yash%20,Parampara.mp3?session_key=4fb01e412bcd34d19c6026ee86466cab&hash=d285108d3645830eeb58bb770b84e056","Street Dancer 3D"));

    recommendedModels.add(new RecommendedModel("https://a10.gaanacdn.com/images/albums/26/3859226/crop_175x175_3859226.jpg",
            "https://cdnm.meln.top/mx/Khalil%20Ahmad%20-%20Jis%20Raat%20Mai%20Tanhai.mp3?hash=LTIwMDE2MTcwMzUvMTA2MTcwMzUubXAz","Mai Jis Din Bhula du"));

    recommendedModels.add(new RecommendedModel("https://a10.gaanacdn.com/gn_img/albums/0wrb4kNWLg/wrb476lyWL/size_m.jpg",
            "","Taaron ka Shehar"));

    recommendedModels.add(new RecommendedModel("https://a10.gaanacdn.com/images/albums/76/3215276/crop_175x175_3215276.jpg",
            "http://balamp3.in/siteuploads/files/sfd1/235/Is%20Tarah%20Aashique%20Ka%20(Unplugged)%20-%20DJ%20Shine(BalaMp3.in).mp3","Meri aashique"));


    recommendedModels.add(new RecommendedModel("https://a10.gaanacdn.com/gn_img/song/ZaP374RWDy/P37N87ZxKD/size_m_1604199274.jpg",
    "http://balamp3.in/siteuploads/files/sfd13/6115/Burj%20Khalifa%20Dj%20Remix%20-%20DJ%20NYK%20(Official%20Remix)(BalaMp3.in).mp3",
          "Burj Khalifa"  ));



   recommendedModels.add(new RecommendedModel("https://a10.gaanacdn.com/gn_img/song/6Zxb2r7b9w/xb2jvG6Gb9/size_m_1570080954.jpg",
           "https://x2convert.com/Listen?l=6RiGEXgBkgVbT44mfYS1&vid=https%3a%2f%2fx2convert.com%2fThankyou%3ftoken%3dU2FsdGVkX1%252f67r2%252fmUEsGaJlvmf7T6vDWeBYabSC8JA%252b0VW%252bh5fx8SU7B5v%252bnY6lFrhLz5QIyO7m3z%252fxIPiDuFZNQ248PqAmDaNTVkVUrR%252fKPvvZrtQmvYUS0r8OoND7dCPPwtdyULfV%252b7fOY2IFlecRrkUh3G4YBGib5Mr4ooFJiR%252fWBubDvOB%252bZVXqQppt2aLjV8o0u6vFbLvrJnuN6QJgAja%252bYmD4yenmshX%252boiromdiFkHFCH%252bOX3D47%252ftrArCP8s6XYQYXVX2NFKtTCyzq5T4HRMJOnkuLExS8%252bDwU%253d%26s%3dyoutube%26id%3d%26h%3d3936047290085554638&audio=1","Tum hi aana"));

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

    @Override
    public void OnItemClickListeners(int position, TrendingEnglishSongModel trendingEnglishSongModel) {

    }

    @Override
    public void OnItemClickListeners(int position, RecommendedModel recommendedModel) {

    }
}