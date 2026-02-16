package com.Event.EventClean.infra.gateway;

import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.core.gateway.EventGateway;
import com.Event.EventClean.infra.mapper.EventEntityMapper;
import com.Event.EventClean.infra.persistency.EventEntity;
import com.Event.EventClean.infra.persistency.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;
    private final EventEntityMapper mapper;

    @Override
    public Event createEvent(Event event) {
        EventEntity entity = mapper.toEntity(event);
        EventEntity newEvent = eventRepository.save(entity);
        return mapper.toDomain(newEvent);
    }

    @Override
    public List<Event> searchEvents() {
        return eventRepository.findAll().stream().map(mapper::toDomain).toList();
    }

    @Override
    public Optional<Event> filterById(String identityEvent) {
        return eventRepository.findByIdentityEvent(identityEvent);
    }

}
