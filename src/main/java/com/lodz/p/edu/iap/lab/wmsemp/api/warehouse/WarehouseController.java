package com.lodz.p.edu.iap.lab.wmsemp.api.warehouse;

import com.lodz.p.edu.iap.lab.wmsemp.api.event.EventController;
import com.lodz.p.edu.iap.lab.wmsemp.entity.event.AddEvent;
import com.lodz.p.edu.iap.lab.wmsemp.entity.event.DeleteEvent;
import com.lodz.p.edu.iap.lab.wmsemp.entity.event.Event;
import com.lodz.p.edu.iap.lab.wmsemp.entity.event.Type;
import com.lodz.p.edu.iap.lab.wmsemp.entity.warehouse.Item;
import com.lodz.p.edu.iap.lab.wmsemp.entity.warehouse.Warehouse;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/warehouse")
@CrossOrigin(origins = "http://localhost:4210")
public class WarehouseController {

    private final WarehouseRepository repository;
    private final EventController eventController;

    public WarehouseController(WarehouseRepository repository, EventController eventController) {
        this.repository = repository;
        this.eventController = eventController;
    }

    @GetMapping("/all")
    public Collection<Warehouse> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Warehouse> getById(@PathVariable(value = "id") Long id) {
        return repository.findById(id);
    }

    @GetMapping("/{externalId}")
    public Optional<Warehouse> getByExternalId(@PathVariable(value = "externalId") String externalId) {
        return repository.findAll().stream().filter(event -> externalId.equals(event.getExternalId())).findFirst();
    }

    @PostMapping
    public void save(@RequestBody AddEvent event) {
        //ToDo
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        DeleteEvent event = new DeleteEvent();
        //ToDo
    }

    @PutMapping("/{id}")
    public void addItem(@PathVariable(value = "id") Long id, @RequestBody AddEvent event) {
        Warehouse warehouse = repository.findById(id).orElseThrow(IllegalStateException::new);
        //warehouse.getItems().add(item);
        repository.save(warehouse);
        //ToDo
    }

    //todo transfer method

}
