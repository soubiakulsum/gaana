package com.example.project_gaana.DataModel;

public class TrendingEnglishSongModel {
    private int Image;

    private String SongName;
    private String SingerName;

    private String Url;

    public TrendingEnglishSongModel(int image, String songName, String singerName, String url) {
        Image = image;
        SongName = songName;
        SingerName = singerName;
        Url = url;
    }

    public int getImage() {
        return Image;
    }

    public String getSongName() {
        return SongName;
    }

    public String getSingerName() {
        return SingerName;
    }

    public String getUrl() {
        return Url;
    }
}
