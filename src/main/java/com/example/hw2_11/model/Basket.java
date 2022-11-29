package com.example.hw2_11.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Item> items;


    public Basket(List<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public List<Item> getItems() {
        return items;
    }

    public void add(List<Item> items) {
        this.items.addAll(items);


    }
    public List<Item> get() {
        return Collections.unmodifiableList(items);
    }

}
