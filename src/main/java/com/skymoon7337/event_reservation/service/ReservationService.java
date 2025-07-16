package com.skymoon7337.event_reservation.service;

import com.skymoon7337.event_reservation.dto.ReservationDto;
import com.skymoon7337.event_reservation.model.Event;
import com.skymoon7337.event_reservation.model.Reservation;
import com.skymoon7337.event_reservation.repository.EventRepository;
import com.skymoon7337.event_reservation.repository.ReservationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final EventRepository eventRepository;

    public Page<Reservation> getByEvent(Long eventId, Pageable pageable) {
        return reservationRepository.findByEventId(eventId, pageable);
    }

    public Reservation create(Long eventId, ReservationDto reservationDto) {
        Event event = eventRepository.findById(eventId).orElseThrow(() -> new NoSuchElementException("이벤트 없음"));

        Reservation reservation = new Reservation();
        reservation.setEvent(event);
        reservation.setAttendeeName(reservationDto.getAttendeeName());
        reservation.setSeat(reservationDto.getSeats());

        return reservationRepository.save(reservation);
    }
}
