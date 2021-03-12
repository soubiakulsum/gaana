package com.example.project_gaana.DataModel;

public class RecommendedModel {

    private String ImageUrl;

    private String SongUrl;

    private String SongName;

    public RecommendedModel(String imageUrl, String songUrl, String songName) {
        ImageUrl = imageUrl;
        SongUrl = songUrl;
        SongName = songName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public String getSongUrl() {
        return SongUrl;
    }

    public String getSongName() {
        return SongName;
    }
}
