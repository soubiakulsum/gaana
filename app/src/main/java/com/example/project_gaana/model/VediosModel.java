package com.example.project_gaana.model;

public class VediosModel {

    private int ivGaanaVedio;
    private String tvVideoName;
    private String tvSingerName;

    public VediosModel(int ivGaanaVedio, String tvVideoName, String tvSingerName) {
        this.ivGaanaVedio = ivGaanaVedio;
        this.tvVideoName = tvVideoName;
        this.tvSingerName = tvSingerName;
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
