package com.sharath.diagonal_task.model;

import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("name")
    private String name;
    @SerializedName("poster-image")
    private String poster_image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoster_image() {
        return poster_image;
    }

    public void setPoster_image(String poster_image) {
        this.poster_image = poster_image;
    }
}
