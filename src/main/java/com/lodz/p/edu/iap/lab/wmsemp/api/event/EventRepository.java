package com.lodz.p.edu.iap.lab.wmsemp.api.event;

import com.lodz.p.edu.iap.lab.wmsemp.entity.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EventRepository extends JpaRepository<Event, Long> {
}
