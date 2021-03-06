package com.example.project_gaana.model;

public class VediosModel {

    private int ivGaanaVedio;
    private String tvVideoName;
    private String tvSingerName;
    private String GaanaVideoUrl;

    public VediosModel(int ivGaanaVedio, String tvVideoName, String tvSingerName, String GaanaVideoUrl) {
        this.ivGaanaVedio = ivGaanaVedio;
        this.tvVideoName = tvVideoName;
        this.tvSingerName = tvSingerName;
        this.GaanaVideoUrl=GaanaVideoUrl;
    }
    public String getGaanaVideoUrl() {
        return GaanaVideoUrl;
    }

    public int getIvGaanaVedio() {
        return ivGaanaVedio;
    }

    public String getTvVideoName() {
        return tvVideoName;
    }

    public String getTvSingerName() {
        return tvSingerName;
    }
}
