package com.example.project_gaana;

import com.example.project_gaana.model.HindiModel;
import com.example.project_gaana.model.PopularEnglishModel;

public interface OnItemClicked {

    void OnItemClicked(PopularEnglishModel englishModel);

    void OnHindiSongClicked(HindiModel hindiModel);
}
