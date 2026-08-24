package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping                          // 1. Endpunkt: Alle Items holen
    public List<Item> getAll() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")                 // 2. Endpunkt: Item nach ID holen
    public Item getById(@PathVariable Long id) {
        return itemService.getItemById(id).orElse(null);
    }

    @PostMapping                         // 3. Endpunkt: Neues Item anlegen
    public Item create(@RequestBody Item item) {
        return itemService.createItem(item);
    }
}