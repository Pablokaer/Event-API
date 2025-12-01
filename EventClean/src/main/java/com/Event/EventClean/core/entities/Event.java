package com.Event.EventClean.core.entities;

import jakarta.persistence.*;
import jdk.jfr.EventType;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Event(
        Long id,
        String name,
        String description,
        String identity,
        LocalDateTime startTime,
        LocalDateTime finishTime,
        String local,
        Integer capacity,
        String manager,
        EventType type) {}
