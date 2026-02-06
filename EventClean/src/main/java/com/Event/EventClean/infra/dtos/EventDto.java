package com.Event.EventClean.infra.dtos;

import jdk.jfr.EventType;

import java.time.LocalDateTime;

public record EventDto(
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
