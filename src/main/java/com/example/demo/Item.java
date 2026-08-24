package com.example.demo;

public class Item {
    private Long id;
    private String name;

    public Item(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
}