package com.skymoon7337.event_reservations.repository;

import com.skymoon7337.event_reservations.model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
    List<Reservation> findByEventId(Integer eventId);
}