package com.skymoon7337.event_reservations.service;

import com.skymoon7337.event_reservations.model.Event;
import com.skymoon7337.event_reservations.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    public List<Event> findAll() { return (List<Event>) eventRepository.findAll(); }

    public Optional<Event> findById(Integer id) { return eventRepository.findById(id); }

    public Event save(Event event) { return eventRepository.save(event); }

    public void deleteById(Integer id) { eventRepository.deleteById(id); }
}