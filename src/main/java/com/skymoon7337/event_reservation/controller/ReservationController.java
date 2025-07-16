package com.skymoon7337.event_reservation.controller;

import com.skymoon7337.event_reservation.dto.ReservationDto;
import com.skymoon7337.event_reservation.model.Reservation;
import com.skymoon7337.event_reservation.service.ReservationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping("/api/events/{eventId}/reservations")
    public Page<Reservation> listByEvent(
            @PathVariable Long eventId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("id").descending());
        return reservationService.getByEvent(eventId, pageable);
    }

    @PostMapping("/api/events/{eventId}/reservations")
    public Reservation add(@PathVariable Long eventId, @Valid @RequestBody ReservationDto reservationDto) {
        return reservationService.create(eventId, reservationDto);
    }
}