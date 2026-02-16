package com.Event.EventClean.infra.persistency;

import com.Event.EventClean.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
    Optional<Event> findByIdentityEvent(String identityEvent);

}
