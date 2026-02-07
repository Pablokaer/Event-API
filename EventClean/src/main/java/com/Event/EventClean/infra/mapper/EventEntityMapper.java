package com.Event.EventClean.infra.mapper;


import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.infra.persistency.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {

    public EventEntity toEntity(Event event){
        return new EventEntity(
                event.id(),
                event.name(),
                event.description(),
                event.identityEvent(),
                event.startTime(),
                event.finishTime(),
                event.localEvent(),
                event.capacity(),
                event.manager(),
                event.type()
        );
    }

    public Event toDomain(EventEntity eventEntity){
        return new Event(
                eventEntity.getId(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getIdentityEvent(),
                eventEntity.getStartTime(),
                eventEntity.getFinishTime(),
                eventEntity.getLocalEvent(),
                eventEntity.getCapacity(),
                eventEntity.getManager(),
                eventEntity.getType()
        );

    }

}
