package com.lodz.p.edu.iap.lab.wmsemp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
public class ItemController {
    private ItemRepository repository;

    public ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String getInitial() {
        return "Server works ;)";
    }

    @GetMapping("/items/all")
    public Collection<Item> getAll() {
        return repository.findAll();
    }

    @GetMapping("/items/get/{id}")
    public Optional<Item> getById(@PathVariable(value = "id") Long id) {
        return repository.findById(id);
    }

    @GetMapping("/items/delete/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        repository.deleteById(id);
    }
}
