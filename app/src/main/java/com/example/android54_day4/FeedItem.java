package com.example.android54_day4;

public class FeedItem {
    private int imageResource;
    private String username;
    private String description;

    public FeedItem(int imageResource, String username, String description) {
        this.imageResource = imageResource;
        this.username = username;
        this.description = description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }
}

