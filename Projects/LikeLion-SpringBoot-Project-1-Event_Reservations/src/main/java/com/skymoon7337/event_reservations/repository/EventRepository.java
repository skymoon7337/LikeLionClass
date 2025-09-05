package com.skymoon7337.event_reservations.repository;

import com.skymoon7337.event_reservations.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

}
