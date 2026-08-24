package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemServiceTest {

    private final ItemService itemService = new ItemService();

    @Test
    void shouldReturnAllItems() {
        assertEquals(2, itemService.getAllItems().size());
    }

    @Test
    void shouldFindItemById() {
        assertTrue(itemService.getItemById(1L).isPresent());
        assertEquals("Laptop", itemService.getItemById(1L).get().getName());
    }
}