package com.sharath.diagonal_task.model;

import com.google.gson.annotations.SerializedName;

public class Page {

    @SerializedName("title")
    private String title;
    @SerializedName("total-content-items")
    private String total_content_items;
    @SerializedName("page-num")
    private String page_num;
    @SerializedName("page-size")
    private String page_size;
    @SerializedName("content-items")
    private ContentItems content_items;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotal_content_items() {
        return total_content_items;
    }

    public void setTotal_content_items(String total_content_items) {
        this.total_content_items = total_content_items;
    }

    public String getPage_num() {
        return page_num;
    }

    public void setPage_num(String page_num) {
        this.page_num = page_num;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public ContentItems getContent_items() {
        return content_items;
    }

    public void setContent_items(ContentItems content_items) {
        this.content_items = content_items;
    }
}
