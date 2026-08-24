package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ItemService {
    private final List<Item> items = new ArrayList<>(List.of(
        new Item(1L, "Laptop"),
        new Item(2L, "Server")
    ));

    public List<Item> getAllItems() { return items; }

    public Optional<Item> getItemById(Long id) {
        return items.stream().filter(item -> item.getId().equals(id)).findFirst();
    }

    public Item createItem(Item item) {
        items.add(item);
        return item;
    }
}