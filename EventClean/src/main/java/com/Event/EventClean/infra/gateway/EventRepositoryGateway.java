package com.Event.EventClean.infra.gateway;

import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.core.gateway.EventGateway;
import com.Event.EventClean.infra.mapper.EventEntityMapper;
import com.Event.EventClean.infra.persistency.EventEntity;
import com.Event.EventClean.infra.persistency.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

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



}
