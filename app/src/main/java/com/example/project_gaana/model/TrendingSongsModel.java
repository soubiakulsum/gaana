package com.example.project_gaana.model;

public class TrendingSongsModel {

    private int ivTrendingSong;
    private String tvTrendingSongName;
    private String tvTrendingSongDownload;

    public TrendingSongsModel(int ivTrendingSong, String tvTrendingSongName, String tvTrendingSongDownload) {
        this.ivTrendingSong = ivTrendingSong;
        this.tvTrendingSongName = tvTrendingSongName;
        this.tvTrendingSongDownload = tvTrendingSongDownload;
    }

    public int getIvTrendingSong() {
        return ivTrendingSong;
    }

    public String getTvTrendingSongName() {
        return tvTrendingSongName;
    }

    public String getTvTrendingSongDownload() {
        return tvTrendingSongDownload;
    }
}
