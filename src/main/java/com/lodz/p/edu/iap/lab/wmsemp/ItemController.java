package com.lodz.p.edu.iap.lab.wmsemp;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/items/get/all")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Item> getAll() {
        return repository.findAll();
    }

    @GetMapping("/items/get/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Optional<Item> getById(@PathVariable(value = "id") Long id) {
        return repository.findById(id);
    }

    @DeleteMapping("/items/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteById(@PathVariable(value = "id") Long id) {
        repository.deleteById(id);
    }

}
