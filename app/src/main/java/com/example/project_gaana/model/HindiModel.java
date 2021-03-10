package com.example.project_gaana.model;

public class HindiModel {

    private int ivHindiSong;
    private String tvHindiSongName;
    private String tvHindiDownloads;

    public HindiModel(int ivHindiSong, String tvHindiSongName, String tvHindiDownloads) {
        this.ivHindiSong = ivHindiSong;
        this.tvHindiSongName = tvHindiSongName;
        this.tvHindiDownloads = tvHindiDownloads;
    }

    public int getIvHindiSong() {
        return ivHindiSong;
    }

    public String getTvHindiSongName() {
        return tvHindiSongName;
    }

    public String getTvHindiDownloads() {
        return tvHindiDownloads;
    }
}
