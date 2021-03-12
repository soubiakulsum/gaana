package com.example.project_gaana.model;

public class PodcatsModel {

    private int ivPodcasts;
    private String tvPodcastName;

    public PodcatsModel(int ivPodcasts, String tvPodcastName) {
        this.ivPodcasts = ivPodcasts;
        this.tvPodcastName = tvPodcastName;
    }

    public int getIvPodcasts() {
        return ivPodcasts;
    }

    public String getTvPodcastName() {
        return tvPodcastName;
    }
}
