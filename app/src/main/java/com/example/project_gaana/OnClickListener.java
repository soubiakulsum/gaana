package com.example.project_gaana;

public interface OnClickListener {
    void playMusic(int pos, ResultsItem resultsItem);
    void pauseMusic();
    void delete(int pos);

}
