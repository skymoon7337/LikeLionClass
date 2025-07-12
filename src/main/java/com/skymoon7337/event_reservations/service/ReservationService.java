package com.skymoon7337.event_reservations.service;

import com.skymoon7337.event_reservations.model.Reservation;
import com.skymoon7337.event_reservations.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public Optional<Reservation> findById(Integer id) {
        return reservationRepository.findById(id);
    }

    public List<Reservation> findByEventId(Integer eventId) {
        return reservationRepository.findByEventId(eventId);
    }

    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteById(Integer id) {
        reservationRepository.deleteById(id);
    }
}