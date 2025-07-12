package com.skymoon7337.event_reservations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("reservations")

public class Reservation {
    @Id
    private Integer id;
    private Integer eventId;
    private String attendeeName;
    private Integer seats;
}
