package com.sharath.diagonal_task.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContentItems {

    @SerializedName("content")
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
