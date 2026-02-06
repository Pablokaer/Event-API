package com.Event.EventClean.infra.persistency;

import org.springframework.data.jpa.repository.JpaRepository;

public interface eventRepository extends JpaRepository<eventEntity, Long> {
}
