package com.example.project_gaana.model;

public class TopChartsModel {

    private int ivTopChartSong;
    private String tvTopChartSongName;
    private String tvTopChartSongDownload;

    public TopChartsModel(int ivTopChartSong, String tvTopChartSongName, String tvTopChartSongDownload) {
        this.ivTopChartSong = ivTopChartSong;
        this.tvTopChartSongName = tvTopChartSongName;
        this.tvTopChartSongDownload = tvTopChartSongDownload;
    }

    public int getIvTopChartSong() {
        return ivTopChartSong;
    }

    public String getTvTopChartSongName() {
        return tvTopChartSongName;
    }

    public String getTvTopChartSongDownload() {
        return tvTopChartSongDownload;
    }
}
