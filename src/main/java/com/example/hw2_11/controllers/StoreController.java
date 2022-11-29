package com.example.hw2_11.controllers;

import com.example.hw2_11.model.Item;
import com.example.hw2_11.servises.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/order")
@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        storeService.add(ids);
    }
    //  @RequestParam  ("title") List<String> title) {
      //  return storeService.add(ids,title);


    @GetMapping("/get")
    public List<Item> get() {
        return storeService.get();
    }

}
