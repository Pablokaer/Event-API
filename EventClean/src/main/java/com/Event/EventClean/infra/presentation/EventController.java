package com.Event.EventClean.infra.presentation;

import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.core.useCases.NewEventCase;
import com.Event.EventClean.infra.dtos.EventDto;
import com.Event.EventClean.infra.mapper.EventDtoMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class EventController {

    private final NewEventCase newEventCase;
    private final EventDtoMapper eventDtoMapper;

    public EventController(NewEventCase newEventCase, EventDtoMapper eventDtoMapper) {
        this.newEventCase = newEventCase;
        this.eventDtoMapper = eventDtoMapper;
    }

    @PostMapping("/createevent")
    public EventDto createEvent(@RequestBody EventDto eventDto){
        Event newEvent = newEventCase.execute(eventDtoMapper.toDomain(eventDto));
        return eventDtoMapper.toDto(newEvent);
    }

    @GetMapping
    public String eventList(){
        return "Event List";
    }


}
