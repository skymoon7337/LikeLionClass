package com.skymoon7337.event_reservations.controller;

import com.skymoon7337.event_reservations.model.Reservation;
import com.skymoon7337.event_reservations.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @PostMapping("/events/{eventId}/reserve")
    public String reserve(@PathVariable Integer eventId, @RequestParam String attendeeName, @RequestParam Integer seats) {
        Reservation reservation = new Reservation(null, eventId, attendeeName, seats);
        reservationService.save(reservation);
        return "redirect:/events/" + eventId;
    }

    @PostMapping("/reservations/{id}/cancel")
    public String cancel(@PathVariable Integer id) {
        Reservation reservation = reservationService.findById(id).orElseThrow();
        reservationService.deleteById(id);
        return "redirect:/events/" + reservation.getEventId();
    }
}