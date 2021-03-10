package com.example.project_gaana.model;

public class RadioModel {

    private int ivRadio;
    private String tvRadioName;

    public RadioModel(int ivRadio, String tvRadioName) {
        this.ivRadio = ivRadio;
        this.tvRadioName = tvRadioName;
    }

    public int getIvRadio() {
        return ivRadio;
    }

    public String getTvRadioName() {
        return tvRadioName;
    }
}
