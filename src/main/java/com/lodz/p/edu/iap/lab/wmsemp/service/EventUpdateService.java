package com.lodz.p.edu.iap.lab.wmsemp.service;

import com.lodz.p.edu.iap.lab.wmsemp.api.event.EventRepository;
import com.lodz.p.edu.iap.lab.wmsemp.entity.event.Event;

public class EventUpdateService implements UpdateAware<Event> {

    private final EventRepository repository;

    public EventUpdateService(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public void update(Long id, Event object) {
        repository.findById(id).ifPresent(event -> {
            event.setAccepted(object.isAccepted());
            // ToDo: must be finish
            repository.save(event);
        });
    }
}
