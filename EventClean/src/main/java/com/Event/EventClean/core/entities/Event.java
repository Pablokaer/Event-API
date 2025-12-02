package com.Event.EventClean.core.entities;

import jdk.jfr.EventType;

import java.time.LocalDateTime;

public record Event(
        Long id,
        String name,
        String description,
        String identityEvent,
        LocalDateTime startTime,
        LocalDateTime finishTime,
        String localEvent,
        Integer capacity,
        String manager,
        EventType type) {}
