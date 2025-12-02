package com.Event.EventClean.infra.persistency;

import com.Event.EventClean.core.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Events")
public class eventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String identityEvent;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    private String localEvent;
    private Integer capacity;
    private String manager;
    @Enumerated(EnumType.STRING)
    private EventType type;
}
