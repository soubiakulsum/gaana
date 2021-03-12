package com.example.project_gaana.model;

public class PopularEnglishModel {
    private int ivEnglishSong;
    private String tvEnglishSongName;
    private String tvEnglishSinger;
    private String tvEnglishDownloads;

    public PopularEnglishModel(int ivEnglishSong, String tvEnglishSongName, String tvEnglishSinger, String tvEnglishDownloads) {
        this.ivEnglishSong = ivEnglishSong;
        this.tvEnglishSongName = tvEnglishSongName;
        this.tvEnglishSinger = tvEnglishSinger;
        this.tvEnglishDownloads = tvEnglishDownloads;
    }

    public int getIvEnglishSong() {
        return ivEnglishSong;
    }

    public String getTvEnglishSongName() {
        return tvEnglishSongName;
    }

    public String getTvEnglishSinger() {
        return tvEnglishSinger;
    }

    public String getTvEnglishDownloads() {
        return tvEnglishDownloads;
    }
}
