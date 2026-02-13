package com.Event.EventClean.infra.presentation;

import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.core.useCases.NewEventCase;
import com.Event.EventClean.core.useCases.SearchEventCase;
import com.Event.EventClean.infra.dtos.EventDto;
import com.Event.EventClean.infra.mapper.EventDtoMapper;
import com.Event.EventClean.infra.persistency.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/")
public class EventController {

    private final NewEventCase newEventCase;
    private final EventDtoMapper eventDtoMapper;
    private final SearchEventCase searchEventCase;
    private final EventRepository eventRepository;

    public EventController(NewEventCase newEventCase, EventDtoMapper eventDtoMapper,
                           EventRepository eventRepository, SearchEventCase searchEventCase) {
        this.newEventCase = newEventCase;
        this.eventDtoMapper = eventDtoMapper;
        this.eventRepository = eventRepository;
        this.searchEventCase = searchEventCase;
    }

    @PostMapping("/createevent")
    public EventDto createEvent(@RequestBody EventDto eventDto){
        Event newEvent = newEventCase.execute(eventDtoMapper.toDomain(eventDto));
        return eventDtoMapper.toDto(newEvent);
    }

    @GetMapping
    public List<EventDto> searchEvents(){
        return searchEventCase.execute().stream().map(eventDtoMapper::toDto).collect(Collectors.toList());
    }
}
