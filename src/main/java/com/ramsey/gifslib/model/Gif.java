package com.ramsey.gifslib.model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private LocalDate dateUpdated;
    private String userName;
    private boolean favorite;

    public Gif(String name, LocalDate dateUpdated, String userName, boolean favorite) {
        this.name = name;
        this.dateUpdated = dateUpdated;
        this.userName = userName;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
