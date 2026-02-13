package com.Event.EventClean.infra.mapper;


import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.infra.dtos.EventDto;
import org.springframework.stereotype.Component;

@Component
public class EventDtoMapper {

    public EventDto toDto(Event event){
        return new EventDto(
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

    public Event toDomain(EventDto eventDto){
        return new Event(
                eventDto.id(),
                eventDto.name(),
                eventDto.description(),
                eventDto.identityEvent(),
                eventDto.startTime(),
                eventDto.finishTime(),
                eventDto.localEvent(),
                eventDto.capacity(),
                eventDto.manager(),
                eventDto.type()
        );
    }
}
