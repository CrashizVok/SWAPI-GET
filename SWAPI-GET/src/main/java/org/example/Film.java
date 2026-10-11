package org.example;
public class Film {
    private String title;
    private int episodeId;
    private String openingCrawl;
    private String director;
    private String releaseDate;
    private String url;

    public Film(String title, int episodeId, String openingCrawl, String director, String releaseDate, String url) {
        this.title = title;
        this.episodeId = episodeId;
        this.openingCrawl = openingCrawl;
        this.director = director;
        this.releaseDate = releaseDate;
        this.url = url;
    }

    public String getTitle(){
        return title;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public String getDirector() {
        return director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getUrl() {
        return url;
    }
}
