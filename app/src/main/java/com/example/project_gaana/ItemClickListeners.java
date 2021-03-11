package com.example.project_gaana;

import com.example.project_gaana.DataModel.RecommendedModel;
import com.example.project_gaana.DataModel.TrendingEnglishSongModel;

public interface ItemClickListeners {

    void OnItemClickListeners(int position, TrendingEnglishSongModel trendingEnglishSongModel);

    void OnItemClickListeners(int position, RecommendedModel recommendedModel);


}
