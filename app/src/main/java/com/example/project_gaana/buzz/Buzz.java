package com.example.project_gaana.buzz;

public class Buzz {
    private String like ;
    private String daysAgo;
    private String article;
    private String expandArtile;

    public Buzz(String like, String daysAgo, String article, String expandArtile) {
        this.like = like;
        this.daysAgo = daysAgo;
        this.article = article;
        this.expandArtile = expandArtile;
    }

    public String getLike() {
        return like;
    }

    public String getDaysAgo() {
        return daysAgo;
    }

    public String getArticle() {
        return article;
    }

    public String getExpandArtile() {
        return expandArtile;
    }

}
