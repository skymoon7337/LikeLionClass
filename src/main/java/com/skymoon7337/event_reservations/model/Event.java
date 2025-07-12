package com.skymoon7337.event_reservations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("events")
public class Event {
    @Id
    private Integer id;
    private String name;
    private LocalDateTime eventDate;
    private String location;
}