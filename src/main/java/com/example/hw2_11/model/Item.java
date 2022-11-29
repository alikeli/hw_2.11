package com.example.hw2_11.model;

import org.springframework.stereotype.Component;


public class Item {
    private final int id;
    private final String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
