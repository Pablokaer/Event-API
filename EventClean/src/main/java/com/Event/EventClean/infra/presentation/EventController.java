package com.Event.EventClean.infra.presentation;

import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.core.useCases.FilterIdCase;
import com.Event.EventClean.core.useCases.NewEventCase;
import com.Event.EventClean.core.useCases.SearchEventCase;
import com.Event.EventClean.infra.dtos.EventDto;
import com.Event.EventClean.infra.mapper.EventDtoMapper;
import com.Event.EventClean.infra.persistency.EventEntity;
import com.Event.EventClean.infra.persistency.EventRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/")
public class EventController {

    private final NewEventCase newEventCase;
    private final EventDtoMapper eventDtoMapper;
    private final SearchEventCase searchEventCase;
    private final EventRepository eventRepository;
    private final FilterIdCase filterIdCase;


    public EventController(NewEventCase newEventCase, EventDtoMapper eventDtoMapper,
                           EventRepository eventRepository, SearchEventCase searchEventCase, FilterIdCase filterIdCase) {
        this.newEventCase = newEventCase;
        this.eventDtoMapper = eventDtoMapper;
        this.eventRepository = eventRepository;
        this.searchEventCase = searchEventCase;
        this.filterIdCase = filterIdCase;
    }

    @PostMapping("/createevent")
    public ResponseEntity<Map<String, Object>> createEvent(@RequestBody EventDto eventDto){
        Event newEvent = newEventCase.execute(eventDtoMapper.toDomain(eventDto));
        Map<String, Object> response = new HashMap<>();
        response.put("Message: ", "Event successfully registered.");
        response.put("Data: ", eventDtoMapper.toDto(newEvent));
        return ResponseEntity.ok(response);
    }

    @GetMapping("/searchevents")
    public List<EventDto> searchEvents(){
        return searchEventCase.execute().stream().map(eventDtoMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/identityEvent/{identityEvent}")
    public ResponseEntity<Event> findById(@PathVariable String identityEvent){
        Event event = filterIdCase.execute(identityEvent);
        return ResponseEntity.ok(event);
    }
}
