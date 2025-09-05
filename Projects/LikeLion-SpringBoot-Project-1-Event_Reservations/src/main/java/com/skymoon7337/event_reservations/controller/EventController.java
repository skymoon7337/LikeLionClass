package com.skymoon7337.event_reservations.controller;

import com.skymoon7337.event_reservations.model.Event;
import com.skymoon7337.event_reservations.model.Reservation;
import com.skymoon7337.event_reservations.service.EventService;
import com.skymoon7337.event_reservations.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;
    private final ReservationService reservationService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("events", eventService.findAll());
        return "events";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable Integer id, Model model) {
        Event event = eventService.findById(id).orElseThrow();
        List<Reservation> reservations = reservationService.findByEventId(id);
        model.addAttribute("event", event);
        model.addAttribute("reservations", reservations);
        return "event_detail";
    }

    @PostMapping
    public String create(Event event) {
        eventService.save(event);
        return "redirect:/events";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Integer id) {
        eventService.deleteById(id);
        return "redirect:/events";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Integer id, Model model) {
        Event event = eventService.findById(id).orElseThrow();
        model.addAttribute("event", event);
        return "event_edit";  // 수정 폼 뷰 이름
    }

    @PostMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Event updatedEvent) {
        Event event = eventService.findById(id).orElseThrow();

        event.setName(updatedEvent.getName());
        event.setEventDate(updatedEvent.getEventDate());
        event.setLocation(updatedEvent.getLocation());

        eventService.save(event);

        return "redirect:/events/" + id;
    }
}
