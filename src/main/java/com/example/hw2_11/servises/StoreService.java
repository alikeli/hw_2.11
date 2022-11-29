package com.example.hw2_11.servises;

import com.example.hw2_11.model.Basket;
import com.example.hw2_11.model.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Map<Integer, Item> items = new HashMap<>();
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }


    public void StoreService() {

        items.put(1, new Item(1, "pencil"));
        items.put(2, new Item(1, "pen"));
        items.put(3, new Item(1, "notebook"));
    }

    public List<Item> get() {
        return basket.get();
    }

    public void add(List<Integer> ids) {
        basket.add(
                ids.stream().map(items::get)
                        .collect(Collectors.toList()));

    }
}
