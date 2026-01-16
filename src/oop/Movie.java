package oop;

import java.util.Arrays;

public class Movie {
    // fields
    private String title;
    private String genre;
    private double imdbRate;
    private String director;
    private int releaseYear;
    private String[] languages;
    private boolean isForChildren;

    //constructor
    public Movie(String title, String genre, double imdbRate, String director, int releaseYear, String[] languages, boolean isForChildren) {
        this.title = title;
        this.genre = genre;
        this.imdbRate = imdbRate;
        this.director = director;
        this.releaseYear = releaseYear;
        this.languages = languages;
        this.isForChildren = isForChildren;
    }

    // methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    public void setImdbRate(double imdbRate) {
        this.imdbRate = imdbRate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public boolean isForChildren() {
        return isForChildren;
    }

    public void setForChildren(boolean forChildren) {
        isForChildren = forChildren;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", imdbRate=" + imdbRate +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", languages=" + Arrays.toString(languages) +
                ", isForChildren=" + isForChildren +
                '}';
    }
}
